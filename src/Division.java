import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator");
        System.out.print("Enter the first number:");
        int first= input.nextInt();
        System.out.print("Enter the second number:");
        int second= input.nextInt();
        float divide = first/second;
        System.out.println("the division of the given numbers:" +divide);
    }
}
