//5. find the armstrong number with in the given interval.(8 minutes)
import java.util.Scanner;

public class ArmstrongNumber {
    static boolean isArmstrong(int theNumber) {
        int length = Integer.toString(theNumber).length();
        int temporaryNumberHolder = theNumber;
        int checkNumber = 0;
        while(temporaryNumberHolder != 0) {
            checkNumber += (int)Math.pow((temporaryNumberHolder % 10),length);
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
        System.out.println("ArmStrong Numbers between the interval " + from + ", " + to + ": ");
        for(int i = from; i <= to; i++) {
            if(isArmstrong(i)) System.out.print(i + " ");
        }
    }
}