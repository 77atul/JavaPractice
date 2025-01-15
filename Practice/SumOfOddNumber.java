import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to the system. ");
        System.out.print("Please enter the number:");
        int num= input.nextInt();
        int sum=SumOdd(num);
        System.out.println("sum of the odd number till " +num+ " is:" +sum);

    }

    public static int SumOdd (int num){
        int sum=0;
        int i=1;
        while (i<=num){
            sum+=i;
            i+=2;
        }
        return sum;
    }
}
