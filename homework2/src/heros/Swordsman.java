package heros;

public class Swordsman extends heroAttributes {
    public String weapon = "sword";
    public int attack = 30;
    public int health = 150;

    public void setNewWeapon(String weaponName, int attack){
        this.weapon = weaponName;
        this.attack = attack;
    }

    public Swordsman(String str, int years) {
        super(str, years);
    }
}
