import java.util.Scanner;

public class SumOfNumber{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.print("Enter the first number:");
        int first= input.nextInt();
        System.out.print("Enter the second number:");
        int second= input.nextInt();
        int Sum = first+second;
        System.out.print("The sum of the two numbers:" + Sum);
    }
}