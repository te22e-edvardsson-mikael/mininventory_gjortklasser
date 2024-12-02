public class Consumable extends Item {
public int usesMax = 0;
public int usesCurrent = 0;

public void use(Character Target){
    if (usesCurrent < usesMax){
        this.usesMax = usesMax;
        this.name = name;
    }


}
}
