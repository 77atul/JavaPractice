import java.util.Scanner;

public class RecursionPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome checker.");
        System.out.println("Enter the string for checking: ");
        String str  = input.next();
//        System.out.println("Your string is " +((isPalindrome(str)? "palindrome" : "Not palindrome")));
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println("the given number is palindrome.");
        } else {
            System.out.println("the given number is not a palindrome.");
        }
    }

    public static boolean isPalindrome (String str ) {
        if (str.length()<=1){
            return true;
        }
        int end = str.length()-1;
        if (str.charAt(0)!=str.charAt(end)){
            return false;
        }
        String newstr = str.substring(1,end);
        return isPalindrome(newstr);

    }
}
