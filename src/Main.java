import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Character mike = new Character();

        mike.backpack.Display();
        String ans = s.nextLine();
        if (ans.equals("Yes")){
            mike.backpack.items.add(new Armor("skinbidi armor", 42));
            System.out.println(mike.name + " More items in inventory");
            mike.backpack.Display();

        }
        else {
            System.out.println(mike.name + " Didnt pick up item");

    }
}}
