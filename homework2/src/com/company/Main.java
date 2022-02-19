package com.company;
import heros.*;
import Weapons.*;
public class Main {

    public static void main(String[] args) {
        Archer archer = new Archer("samad", 50);
        Swordsman swordsman = new Swordsman("erasyl", 45);

        System.out.println("My name is " + archer.name + " the damage is " + archer.attack + " the weapon is " + archer.weapon );
        System.out.println("My name is " + swordsman.name + " the damage is " + swordsman.attack + " the weapon is " + swordsman.weapon );

        Spear spear = new Spear();
        Gun gun = new Gun();

        swordsman.setNewWeapon(spear.retName(), spear.retDamage());
        archer.setNewWeapon(gun.retName(), gun.retDamage());

        System.out.println("");

        System.out.println("My name is " + swordsman.name + " the damage is " + swordsman.attack + " the weapon is " + swordsman.weapon );
        System.out.println("My name is " +archer.name + " the damage is " + archer.attack + " the weapon is " + archer.weapon );

    }
}
