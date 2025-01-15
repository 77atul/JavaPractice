import java.util.Scanner;

public class GuessGame {
    int random ;
    GuessGame(){
    random = (int)Math.ceil(Math.random()*100);
    }
    int guess (int guessnumber){
        return guessnumber-random;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    GuessGame game = new GuessGame();
        System.out.println("Welcome to guessing game.");
        int result;
        do {
            System.out.print("Please guess a number from 1 to 100:");
            int guess  = input.nextInt();
            result = game.guess(guess);
            if (result == 0){
                System.out.println("Congrats , you have guessed the number.");
            } else if (result<0) {
                System.out.println("Guess higher");
            }else {
                System.out.println("Guess lower");
            }
        }while (result != 0);
    }

}

