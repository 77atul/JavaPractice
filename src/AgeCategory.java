import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("welcome to system.");
        System.out.print("enter your age:");
        int age= input.nextInt();
        if (age>60) {
            System.out.println("hello old man");
        } else if (19 <age) {
            System.out.println("hello adult");
        } else{
            System.out.println("hello teen");
                }
    }
}
