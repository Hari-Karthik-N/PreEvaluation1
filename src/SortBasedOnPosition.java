//20.Write a program to sort the elements in odd positions in descending order and elements in even position ascending order
// (8 minutes)
//        Eg 1: Input: 13,2 4,15,12,10,5
//        Output: 13,2,12,10,5,15,4
//        Eg 2: Input: 1,2,3,4,5,6,7,8,9
//        Output: 9,2,7,4,5,6,3,8,1

import java.util.Scanner;

public class SortBasedOnPosition {
    static void swap(int[] array, int index1, int index2) {
        array[index1] = array[index1] + array[index2];
        array[index2] = array[index1] - array[index2];
        array[index1] = array[index1] - array[index2];
    }

    static void sortEvenAscending(int[] array) {
        if(array.length < 4) return;
        boolean toCheck = true;
        while(toCheck) {
            toCheck = false;
            for(int i = 1; i < array.length - 2; i+=2) {
                if(array[i] > array[i+2]) {
                    toCheck = true;
                    swap(array,i,i+2);
                }
            }
        }
    }

    static void sortOddDescending(int[] array) {
        if(array.length < 3) return;
        boolean toCheck = true;
        while(toCheck) {
            toCheck = false;
            for(int i = 0; i < array.length - 2; i+=2) {
                if(array[i] < array[i+2]) {
                    toCheck = true;
                    swap(array,i,i+2);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < arraySize; i++) array[i] = input.nextInt();
        sortEvenAscending(array);
        sortOddDescending(array);
        System.out.println("elements after sorting: ");
        for(int i : array) {
            System.out.print(i + " ");
        }
    }
}
