import java.util.Scanner;

public class MathCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.print("Enter the first number:");
        int first= input.nextInt();
        System.out.print("Enter the second number:");
        int second= input.nextInt();
        int sum= first+second;
        double mul= first*second;
        float divide= first/second;
        int mod= first%second;
        System.out.println("The sum of the numbers is:" +sum);
        System.out.println("The mul of the numbers is:" +mul);
        System.out.println("The divide of the numbers is:" +divide);
        System.out.println("The mod of the numbers is:" +mod);

    }
}
