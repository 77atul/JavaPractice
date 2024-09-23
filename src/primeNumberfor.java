import java.util.Scanner;

public class primeNumberfor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for checking.");
        System.out.print("Enter the number for check: ");
        int num = input.nextInt();
        System.out.println("Your number is" +(isprime(num)?"Prime": "Not Prime"));
    }
    public static boolean isprime(int num) {
        for (int i=2; i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
