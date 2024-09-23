import java.util.Scanner;

public class numberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =5,guess;
        System.out.println("Welcome to guess game.");
        do {
            System.out.print("Please guess a number from 1 to 10: ");
             guess=input.nextInt();
        }
        while (num!=guess);
        System.out.println("Congratulations your guess was right. ");
    }
}
