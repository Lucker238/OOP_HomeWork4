import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<E extends Warrior> implements Iterable<E>{
    List<E> warriors = new ArrayList<>();
    
    private Comandor comandor;

    public Comandor getComandor() {
        return comandor;
    }

    public Team(Comandor comandor){
        this.comandor = comandor;

    }

    public void addWarrior(E newWarrior) {
        warriors.add(newWarrior);
    }

    @Override
    public Iterator<E> iterator() {
        return warriors.iterator();
    }

    public int getAllDamage() {
        int allDamage = 0;
        for(E e: this){
            allDamage += e.getWeapon().damage();
        }
        return allDamage;
    }

    public int getAllHP() {
        int allHP = 0;
        for (E e : this) {
            allHP += e.getHp();
        }
        return allHP;
    }

    public int getMaxRange() {
        int allRange = 0;
        for (E e : this) {
            Weapon weapon = e.getWeapon();
            if(weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                if(allRange < bow.range()) {
                    allRange = bow.range();
                }
            }
        }
        return allRange;
    }

    public int getAllDefence() {
        int def = 0;
        for (E e : warriors) {
            def += e.getShield().Defence();
        }
        return def;
    }
}