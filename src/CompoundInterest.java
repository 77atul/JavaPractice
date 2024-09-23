import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the principle value:");
        double p= input.nextInt();
        System.out.print("Enter the rate:");
        float r= input.nextFloat();
        System.out.print("Enter the time required in months:");
        double t= input.nextInt();
        double ci= p*
        (Math.pow((1+ r/100), t));
        System.out.print("Compound Interest is:" +ci);
    }
}
