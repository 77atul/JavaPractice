import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Multiplication table.");
        System.out.print("Please enter the number to get the table:");
        int num = input.nextInt();
        PrintTable(num);

    }

    public static void PrintTable(int num) {
        int i=1;
        while(i<=10){
            System.out.println(num+"X"+i+"="+num*i);
            i++;
        }

    }

}
