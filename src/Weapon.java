import java.util.Random;
import java.util.random.RandomGenerator;

public class Weapon extends Item {
    public int minDamage = 1;
    public int maxDamage = 0;


    //construct
    public Weapon (String name, int maxDamage){
        this.name = name;
        this.maxDamage = maxDamage;
    }
    public int attack() {
        Random gen = new Random();
        int damage = gen.nextInt(minDamage, maxDamage + 1);

        return damage;
    }
}