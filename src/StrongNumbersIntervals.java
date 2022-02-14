//16.print all Strong numbers between 1 to n. (8 mintues)
import java.util.Scanner;

public class StrongNumbersIntervals {
    static int factorial(int theNumber) {
        if(theNumber == 0) return 1;
        return theNumber * factorial(theNumber - 1);
    }

    static boolean isStrong(int theNumber) {
        int temporaryNumberHolder = theNumber;
        int checkNumber = 0;
        while(temporaryNumberHolder != 0) {
            checkNumber += factorial(temporaryNumberHolder%10);
            temporaryNumberHolder /= 10;
        }
        if(theNumber == checkNumber) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the interval: ");
        int from = input.nextInt();
        int to = input.nextInt();
        System.out.println("Strong Numbers between the interval " + from + ", " + to + ": ");
        for(int i = from; i <= to; i++) {
            if(isStrong(i)) System.out.print(i + " ");
        }
    }
}
