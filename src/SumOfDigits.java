import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("We are going to find sum of the digits of given number.");
        System.out.print("Enter the digit:");
        int digit= input.nextInt();
        int sum= SumOfDigits(digit);
        System.out.print("the sum of the given digits are:"+sum);
    }
    public static int SumOfDigits(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
}
