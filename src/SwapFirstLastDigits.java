//18.Write a program to swap first and last digits of a number. (5 minutes)
import java.util.Scanner;

public class SwapFirstLastDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int theNumber = input.nextInt();
        int length = Integer.toString(theNumber).length();
        int firstDigit = theNumber / (int)Math.pow(10,length-1), lastDigit = theNumber % 10;
        theNumber /= 10;
        theNumber = ((theNumber * 10) + firstDigit);
        theNumber = (lastDigit * (int)Math.pow(10,length-1)) + (theNumber % (int)Math.pow(10,length-1));
        System.out.println("the reversed version is: " + theNumber);
    }
}
