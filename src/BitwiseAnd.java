import java.util.Scanner;

public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to checker.");
        System.out.print("Enter the first number:");
        int first = input.nextInt();
        System.out.print("Enter the second number:");
        int second = input.nextInt();
        System.out.print("Enter the third number:");
        int third = input.nextInt();
        int join = first &second&third;
        System.out.print("the result is:" + join);
    }
}
