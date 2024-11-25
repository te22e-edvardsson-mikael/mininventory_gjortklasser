import java.util.Scanner;

public class Character {
    public Inventory backpack;
    public int Hp;
    public String name;


public Character() {
    Scanner s = new Scanner(System.in);
    System.out.println("what is ur character name? ");
    name = s.nextLine();
}
}