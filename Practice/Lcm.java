import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Lcm station.");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int factor= printlcm(first,second);
        System.out.println("the lcm is :"+factor);


    }

    public static int printlcm(int first, int second) {
        int i = 1;
        while (i <= second) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }

        return 0;
    }

}
