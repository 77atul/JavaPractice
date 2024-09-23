import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age= 0;
        do {
            System.out.print("Please enter your valid age: ");
            age= input.nextInt();
        }while (age<0 || age>100);
    }
}
