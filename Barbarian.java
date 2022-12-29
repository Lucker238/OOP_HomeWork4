public class Barbarian extends Warrior<Axe, HeavyShield>{

    
    public Barbarian(String name, Axe weapon, int hp, HeavyShield shield) {
        super(name, weapon, hp, shield);
    }

    @Override
    public String toString() {
        return "Class: Barbarian, " + super.toString();
    }

}
