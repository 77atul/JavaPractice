import java.util.Scanner;

public class RecursionFibonacci {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Welcome to fibonacci calculator.");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        for (int i= 1; i<=num ;i++){
            System.out.println(fibonacci(i) + " ");
        }
    }

    public static int  fibonacci (int position) {
        System.out.print(".");
        if (position == 1) {
            return 0;
        }
        if (position == 2){

            return 1;
        }
        return fibonacci( position -1) + fibonacci(position-2);
    }
}
