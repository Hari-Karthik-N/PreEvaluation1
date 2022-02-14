//8. find the position of the given element in the array if the element is not in the array then return -1. (8 minutes)
import java.util.Arrays;
import java.util.Scanner;

public class IndexFindArray {
    static int indexSearch(int[] array, int searchElement) {
        Arrays.sort(array);
        int left = 0, right = array.length-1;
        while(left <= right) {
            int middle = (left + right) / 2;
            if(array[middle] == searchElement) return middle;
            if(searchElement > array[middle]) left = middle+1;
            else right = middle - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arraySize; i++) array[i] = input.nextInt();
        System.out.println("Enter the search element: ");
        int searchElement = input.nextInt();
        System.out.println("The element is at: " + indexSearch(array, searchElement));
    }
}
