import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name =scanner.nextLine();
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println("Are you a student? ");
        boolean isStudent = scanner.nextBoolean();
        if(isStudent) {
            System.out.println("gpa");
            double gpa = scanner.nextDouble();

            System.out.println("hello " + name + " your age is" + age + "your gpa is" + gpa);
        }else{
            System.out.println("hello "+name+" your age is "+age);
        }
 //common issues
        System.out.print("Enter name");
        double width = 0;
        double height = 0;
        double area=0;
        System.out.println("enter widh :");
        width = scanner.nextDouble();
        System.out.println("enter height :");
        height = scanner.nextDouble();
        area = width*height;
        System.out.println("Area is  : "+area+"CM²");
        scanner.close();

    }
}