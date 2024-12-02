import java.util.ArrayList;

public class Inventory {
    public ArrayList<Item> items = new ArrayList<>();

    public void  Display(){
        System.out.println("current items in backpack :");
        for (Item item : items) {
            System.out.println(item.name);

        }
    }
    public Inventory(){
        items.add(new Weapon("Butter knife", 10));
        items.add(new Consumable(5, " heal"));
    }

}
