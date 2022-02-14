//10. find the given string is palindrome or not. (3 minutes)
import java.util.Scanner;

public class StringPalindrome {
    static String isString(String theString) {
        for(int i = 0, j = theString.length()-1; i<j; i++,j--) {
            if(theString.charAt(i) != theString.charAt(j)) return "Not a Palindrome !";
        }
        return "Palindrome !";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String theString = input.next();
        System.out.println(isString(theString));
    }
}
