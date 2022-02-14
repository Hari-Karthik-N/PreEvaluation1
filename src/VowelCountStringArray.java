//11.given an array of strings and the array size, count the vowels in each string and print them. (7 minutes)
import java.util.Scanner;

public class VowelCountStringArray {
    static int vowelCount(String theString) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for(int i = 0; i < theString.length(); i++) {
            if (vowels.contains(Character.toString(theString.charAt(i)))) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Array Size: ");
        int arraySize = input.nextInt();
        String[][] array = new String[arraySize][2];
        for(int i = 0; i < arraySize; i++) {
            array[i][0] = input.next();
            array[i][1] = Integer.toString(vowelCount(array[i][0]));
        }
        for(int i = 0; i < arraySize; i++) {
            System.out.println(array[i][0] + " " + array[i][1]);
        }
    }
}
