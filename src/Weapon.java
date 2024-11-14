import java.util.Random;
import java.util.random.RandomGenerator;

public class Weapon {
    public int minDamage = 1;
    public int maxDamage = 11;

    public int attack() {
        return (int) (Math.random() * (maxDamage - minDamage)) + minDamage;


    }
}