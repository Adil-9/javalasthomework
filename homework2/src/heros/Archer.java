package heros;

public class Archer extends heroAttributes {
    public String weapon = "bow";
    public int attack = 25;
    public int health = 50;

    public void setNewWeapon(String weaponName, int attack){
        this.weapon = weaponName;
        this.attack = attack;
    }

    public Archer(String str, int years){
        super(str, years);
        }
}
