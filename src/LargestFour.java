//2. print first largest four numbers in the given array.(5 minutes)
import java.util.Scanner;

public class LargestFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arraySize = input.nextInt();
        if(arraySize < 4) {
            System.out.println("Enter a valid array size!");
            return;
        }
        System.out.println("Enter the array elements: ");
        int array[] = new int[arraySize];
        for(int i = 0; i < arraySize; i++) array[i] = input.nextInt();
        int firstLargest = 0, secondLargest = 0, thirdLargest = 0, fourthLargest = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > firstLargest) {
                secondLargest = firstLargest;
                thirdLargest = secondLargest;
                fourthLargest = thirdLargest;
                firstLargest = array[i];
            }
            else if(array[i] > secondLargest) {
                thirdLargest = secondLargest;
                fourthLargest = thirdLargest;
                secondLargest = array[i];
            }
            else if(array[i]  > thirdLargest) {
                fourthLargest = thirdLargest;
                thirdLargest = array[i];
            }
            else if(array[i] > fourthLargest) {
                fourthLargest = array[i];
            }
        }
        System.out.println("First Largest: " + firstLargest + "\nSecond Largest: " + secondLargest + "\nThird Largest: " + thirdLargest + "\nFourth Largest: " + fourthLargest);
    }
}
