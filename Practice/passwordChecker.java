import java.util.Scanner;

public class passwordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to password checker.");
         String pass;
        do {
            System.out.print("Please enter a valid password: ");
            pass = input.next();
        }while (!isValidPassword(pass));
        System.out.println("Thanks for entering a valid password.");
    }

    public static boolean isValidPassword (String pass) {
        return pass.length()<=5;


    }
}
