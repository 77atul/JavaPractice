import java.util.Scanner;

public class multiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication table.");
        System.out.print("Please enter the number to get the table:");
        int num = input.nextInt();
        PT(num);
    }
        public static void PT (int num){
            int i;
            for (i = 1; i <= 5; i++) {
                System.out.println(num + " X " + i + " = " + num * i);
            }

        }
    }
