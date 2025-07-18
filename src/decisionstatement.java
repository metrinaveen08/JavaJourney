import java.util.Scanner;
public class decisionstatement {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        //if statements
        System.out.println("Enter your name");
       String name = scanner.nextLine();
     System.out.println("Enter your age: ");
     int age;

     age = scanner.nextInt();
     if(name.isEmpty()){
         System.out.println("Enter something as name dude!");
     }
     else if(age<=47){
         System.out.println(age+" good");
     }
     else{
         System.out.println(age+" not bad");
     }
//hi
    scanner.close();
    }
}
