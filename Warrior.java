/**
 * Warrior
 */
public abstract class Warrior<W extends Weapon, S extends Shield> {
    private String name;
    private W weapon;
    private int hp;
    private S shield;

    
    
    
    public Warrior(String name, W weapon, int hp, S shield) {
        this.name = name;
        this.weapon = weapon;
        this.hp = hp;
        this.shield = shield;
    }
    
    public S getShield() {
        return shield;
    }


    public void setShield(S shield) {
        this.shield = shield;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public W getWeapon() {
        return weapon;
    }


    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }


    public int getHp() {
        return hp;
    }


    public void setHp(int hp) {
        this.hp = hp;
    }
    
    @Override
    public String toString() {
        return String.format("Name: %s, HP: %d, Weapon: %s, Shield: %s", name, hp, weapon, shield);
    }
}