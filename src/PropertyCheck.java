import java.util.Scanner;

public class PropertyCheck {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to property check.");
        System.out.println("Enter the no for checking:");
        float num= input.nextFloat();
        if(num>0){
            System.out.println("the given number is positive. ");
        } else if (num<0){
            System.out.println("the given number is negative.");
        }else {
            System.out.println("the number is zero.");}
    }
}
