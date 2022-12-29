public class IronShield extends HeavyShield{

    @Override
    public int Defence() {
        return 50;
    }
    
    @Override
    public String toString() {
        return "Iron Shield, " + super.toString();
    }
}
