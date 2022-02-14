//6. find the factorial of a number.(3 minutes)
import java.util.Scanner;

public class FactorialNumber {
    static int factorial(int theNumber) {
        if(theNumber == 0) return 1;
        return theNumber * factorial(theNumber - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int theNumber = input.nextInt();
        System.out.println("Factorial value: " + factorial(theNumber));
    }
}