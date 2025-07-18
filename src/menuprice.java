import java.util.Scanner;

public class menuprice {
    public static void main(String[] args){
        System.out.println("What item would you like to purchase?: ");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        System.out.println("What is th price for the item?: ");
        double price = scanner.nextDouble();
        System.out.println("How much is the quantity?: ");
        int quantity = scanner.nextInt();//ytrd
        double total = price*quantity;
        System.out.println("You have bought "+quantity+" "+item+"/s");
        System.out.println("Your total is $"+total);
        scanner.close();
    }
}
