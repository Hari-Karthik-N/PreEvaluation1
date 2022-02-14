//7. find the fibonacci series of n.(8 minutes)
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int theValue = input.nextInt();
        if(theValue == 0) {
            System.out.println("Enter a valid value");
            return;
        }
        System.out.println("fibonacci series: ");
        int firstNumber = 0, secondNumber = 1;
        if(theValue == 1) {
            System.out.print(firstNumber);
        } else if(theValue == 2) {
            System.out.print(firstNumber + " " + secondNumber);
        } else {
            System.out.print(firstNumber + " " + secondNumber + " ");
            while(theValue --> 0) {
                System.out.print((firstNumber + secondNumber) + " ");
                int temporaryNumberHolder = (firstNumber + secondNumber);
                firstNumber = secondNumber;
                secondNumber = temporaryNumberHolder;
            }
        }
    }
}
