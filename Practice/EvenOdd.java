import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to even odd checker.");
        System.out.println("Enter the number for checking:");
        int num= input.nextInt();
        while (num>0){
            if (num%2==0){
                System.out.println("the given number is even number.");
            } else {
                System.out.println("the given number is odd.");
            }

        }
        System.out.println("the given is invalid.");

    }
}
