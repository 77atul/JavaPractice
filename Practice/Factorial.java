import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial station.");
        System.out.print("Enter the number for the factorial:");
        long num = input.nextInt();
        long fact = PrintFactorial(num);
        System.out.println(+fact);
    }

    public static long PrintFactorial(long num) {
        long fact=1;
        int i=2;
        if (i <2){
            return 1;
        }
        while (i<=num){
            fact=fact* i;
            i++;
        }
        return fact;
    }
}
