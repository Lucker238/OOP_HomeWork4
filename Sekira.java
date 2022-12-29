public class Sekira extends Axe{

    @Override
    public int damage() {
        return 40;
    }

    @Override
    public int attackSpeed() {
        return 20;
    }
    
    @Override
    public String toString() {
        return "Sekira, " + super.toString();
    }
}
