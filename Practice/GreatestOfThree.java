import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to checker.");
        System.out.println("Enter the first number:");
        int first = input.nextInt();
        System.out.println("Enter the second number:");
        int second = input.nextInt();
        System.out.println("Enter the third number:");
        int third = input.nextInt();
        if(first>second&&first>third){
            System.out.println("first number is greatest among others.");
        } else if (second>third) {
            System.out.println("the second number is greater then others.");
        }else {
            System.out.println("the third number is greatest.");
        }
    }
}
