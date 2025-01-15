import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking whether the given number is palindrome.");
        System.out.println("Enter the number for checking: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println("the given number is palindrome.");
        } else {
            System.out.println("the given number is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    public static int reverse(int num) {
        int newnum = 0;
        while (num > 0) {
            int digit = num % 10;
            newnum = newnum * 10 + digit;
            num /= 10;
        }
        return newnum;
    }
}