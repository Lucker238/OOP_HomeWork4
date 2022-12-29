public abstract class Axe implements Weapon{

    @Override
    public String toString() {
        return String.format("Damage: %d, AS: %d",damage(), attackSpeed());
    }
}

