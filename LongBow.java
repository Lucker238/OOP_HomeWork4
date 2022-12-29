public class LongBow extends Bow{

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public int attackSpeed() {
        return 15;
    }

    @Override
    public int range() {
        return 100;
    }

    @Override
    public String toString() {
        return "Long Bow, " + super.toString();
    }
    
}
