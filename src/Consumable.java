public class Consumable extends Item {
public int usesMax = 0;
public int usesCurrent = 0;

public Consumable(int usesMax, String name){
    this.usesMax = usesMax;
    this.name = name;
}

public void use(Character Target){
    if (usesCurrent < usesMax){
        System.out.println();
    }


}
}
