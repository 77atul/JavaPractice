import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to pattern printing.");
        System.out.print("Enter the number of rows:");
        int rows = input.nextInt();
        PrintFirstPattern(rows);
    }
        public static void PrintFirstPattern(int maxrows) {
            int rows = maxrows;
            while (rows>0){
                int i = 0;
                while (i < rows-1) {
                    System.out.print(" ");
                    i++;
                }
                int j=0;
                while (j<=(maxrows-rows)){
                    System.out.println(" *");
                }
                j++;
            }
            System.out.println();
            rows++;
        }
}


