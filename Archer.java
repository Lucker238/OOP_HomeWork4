public class Archer extends Warrior<Bow, LightShield>{


 
    public Archer(String name, Bow weapon, int hp, LightShield shield) {
        super(name, weapon, hp, shield);
    }

    @Override
    public String toString() {
        return "Class: Archer, " + super.toString();
    }
    
}
