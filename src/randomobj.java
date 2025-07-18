import java.util.Random;
import java.util.Scanner;

public class randomobj {
    public static void main(String[] args){
        Random rn = new Random();
        Scanner input = new Scanner(System.in);
        int number;
        int x;
        System.out.println("Enter the seed");
        x = input.nextInt();
        System.out.println("Enter from range from");
        int range1= input.nextInt();
        System.out.println("Enter range till");
        int range2 = input.nextInt();
        number = rn.nextInt(range1,range2);
        number = number + x;
        System.out.println(number);

    }
}
