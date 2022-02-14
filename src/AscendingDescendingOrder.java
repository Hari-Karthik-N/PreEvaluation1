//1. print both ascending order and descending order. (5 minutes)
import java.util.Scanner;
public class AscendingDescendingOrder {
    static void swap(int[] array, int index1, int index2) {
        array[index1] = array[index1] + array[index2];
        array[index2] = array[index1] - array[index2];
        array[index1] = array[index1] - array[index2];
    }

    static void ascendingSort(int[] array) {
        boolean toCheck = true;
        while(toCheck) {
            toCheck = false;
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i+1]) {
                    toCheck = true;
                    swap(array,i,i+1);
                }
            }
        }
    }

    static void descendingSort(int[] array) {
        boolean toCheck = true;
        while(toCheck) {
            toCheck = false;
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i+1]) {
                    toCheck = true;
                    swap(array,i,i+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < arraySize; i++) array[i] = input.nextInt();
        System.out.println("Ascending order: ");
        ascendingSort(array);
        for(int i : array) System.out.print(i + " ");
        System.out.println("\nDescending order: ");
//        for(int j = array.length - 1; j >= 0; j--) System.out.print(j + " ");
        descendingSort(array);
        for(int i : array) System.out.print(i + " ");
    }
}
