//4. find the prime number with in the given interval.(5 minutes)
import java.util.Scanner;

public class PrimeNumberInterval {
    static boolean isPrime(int theNumber) {
        if(theNumber <= 1) return false;
        if(theNumber == 2) return true;
        for(int i = 2; i <= theNumber/2; i++) {
            if(theNumber % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the interval: ");
        int from = input.nextInt();
        int to = input.nextInt();
        System.out.println("Prime Numbers between the interval " + from + ", " + to + ": ");
        for(int i = from; i <= to; i++) {
            if(isPrime(i)) System.out.print(i + " ");
        }
    }
}
