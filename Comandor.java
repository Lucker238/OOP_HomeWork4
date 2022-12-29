public class Comandor extends Warrior<Weapon, HeavyShield>{

    
    public Comandor(String name, Weapon weapon, int hp, HeavyShield shield) {
        super(name, weapon, hp, shield);
    }

    @Override
    public String toString() {
        return "Class: Comandor, " + super.toString();
    }
}
