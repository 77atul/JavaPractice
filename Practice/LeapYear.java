import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to leap year identifier.");
        System.out.println("Enter the year for checking.");
        int year= input.nextInt();
        if (year%4==0&&year%100!=0){
            System.out.println("the given year is a leap year.");
        }else if (year%400==0){
            System.out.println("the given year is a leap year.");
        }else {
            System.out.println("the given year is not a leap year.");
        }
    }
}
