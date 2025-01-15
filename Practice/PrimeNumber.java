import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for checking.");
        System.out.println("Enter the number for check: ");
        int num = input.nextInt();
        boolean isprime = isprime(num);
        if (isprime){
            System.out.println("the given number is prime number.");
        }else {
            System.out.println("the given number is not a prime number.");
        }

    }

    public static boolean isprime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }

     return true;
    }


}