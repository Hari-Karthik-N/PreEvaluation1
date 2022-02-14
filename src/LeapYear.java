//3. find the given number leap year or not.(3 minutes)
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println("Leap Year!");
                } else {
                    System.out.println("Not a Leap Year!");
                }
            } else {
                System.out.println("Leap Year!");
            }
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
