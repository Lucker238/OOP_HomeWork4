public class Main {
    public static void main(String[] args) {
        Comandor com1 = new Comandor("Hawkeye", new LongBow(), 500, new IronShield());
        Team<Archer> archers = new Team<>(com1); 
        archers.addWarrior(new Archer("Legolas", new LongBow(), 290, new WoddenShield()));
        archers.addWarrior(new Archer("Kitnes", new LongBow(), 210, new WoddenShield()));

        Comandor com2 = new Comandor("Odin", new Sekira(), 540, new IronShield());
        Team<Barbarian> barbarians = new Team<>(com2);
        barbarians.addWarrior(new Barbarian("Kratos", new Sekira(), 430, new IronShield()));
        barbarians.addWarrior(new Barbarian("Ronan", new Sekira(), 380, new IronShield()));

        Comandor com3 = new Comandor("Star Lord", new LongBow(), 400, new IronShield());
        Team<Warrior> allStars = new Team<>(com3);
        allStars.addWarrior(new Archer("Rocket", new LongBow(), 200, new WoddenShield()));
        allStars.addWarrior(new Barbarian("Draks", new Sekira(), 380, new IronShield()));

        System.out.println(com1);
        for (Archer archer : archers) {
            System.out.println(archer);
        }
        System.out.println("Sum Damage: " + archers.getAllDamage());
        System.out.println("Sum HP: " + archers.getAllHP());
        System.out.println("Max Range: " + archers.getMaxRange());
        System.out.println("Sum Defence: " + archers.getAllDefence());
        System.out.println();
        System.out.println(com2);
        for (Barbarian barbarian : barbarians) {
            System.out.println(barbarian);
        }
        System.out.println("Sum Damage: " + barbarians.getAllDamage());
        System.out.println("Sum HP: " + barbarians.getAllHP());
        System.out.println("Max Range: " + barbarians.getMaxRange());
        System.out.println("Sum Defence: " + barbarians.getAllDefence());
        System.out.println();
        System.out.println(com3);
        for (Warrior wars : allStars) {
            System.out.println(wars);
        }
        System.out.println("Sum Damage: " + allStars.getAllDamage());
        System.out.println("Sum HP: " + allStars.getAllHP());
        System.out.println("Max Range: " + allStars.getMaxRange());
        System.out.println("Sum Defence: " + allStars.getAllDefence());
    }
}
