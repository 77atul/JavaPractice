import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Gcd station.");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int gcdfactor= printgcd(first,second);
        System.out.println("the Gcd is :"+gcdfactor);


        }

        public static int printgcd(int first, int second) {
            int gcdfactor=1;
            int i = 1;
            while (i <= second) {

                if (first%i == 0 &&  second % i ==0){
                    gcdfactor=i;
                }
                i++;
            }
            return gcdfactor;
        }

}
