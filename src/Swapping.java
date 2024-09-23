import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to the swapping system.");
        System.out.print("Enter the first number:");
        int first= input.nextInt();
        System.out.print("Enter the second number: ");
        int second= input.nextInt();
        int temp = first;
        first = second;
        second = temp;
        System.out.println("Swapping has been done.");
        System.out.println("The value of the Firtsnumber:" +first);
        System.out.println("The value of the Secondnumber:" +second);
    }
}
