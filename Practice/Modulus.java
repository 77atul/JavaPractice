import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.print("Enter the first number:");
        int first= input.nextInt();
        System.out.print("Enter the second number:");
        int second= input.nextInt();
        int mod= first%second;
        System.out.println("the modulus of the given numbers:" +mod);
    }
}
