import java.util.Scanner;

public class OccurenceForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find the number of occurence.");
        int n ;
        System.out.print("Enter the size of the array : ");
        n = input.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of the array : ");
        arr[n]=input.nextInt();
        System.out.print("Enter the number for occurence : ");
        int num = input.nextInt();
        int occ = 1;
        for (int i=0;i<num;i++){
            if (num ==arr[i]){

                occ++;

            }

        }
        System.out.println(num+" occured "+occ+" times. ");



    }
}
