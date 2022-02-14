//12.Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
//        1. 5 if a perfect square
//        2. 4 if multiple of 4 and divisible by 6
//        3. 3 if even number
//        And sort the numbers based on the weight and print it as follows
//        <10,its_weight>,<36,its weight><89,its weight>. (17 minutes)

import java.util.Scanner;

public class SortOnWeights {
    static int isPerfectSquare(int theNumber) {
        return ((int)Math.pow((int)Math.sqrt(theNumber), 2) == theNumber) ? 5 : 0;
    }

    static int isDivisibleFourSix(int theNumber) {
        return (theNumber % 4 == 0 && theNumber % 6 == 0) ? 4 : 0;
    }

    static int isEven(int theNumber) {
        return (theNumber % 2 == 0) ? 3 : 0;
    }

    static int giveWeight(int theNumber) {
        return isDivisibleFourSix(theNumber) + isEven(theNumber) + isPerfectSquare(theNumber);
    }

    static void sortOnWeight (int[][] array) {
        boolean toCheck = true;
        while(toCheck) {
            toCheck = false;
            for(int i = 0;i<array.length-1;i++) {
                if(array[i][1] > array[i+1][1]) {
                    toCheck = true;
                    int temp = array[i][0];
                    int temp1 = array[i][1];
                    array[i][0] = array[i+1][0];
                    array[i][1] = array[i+1][1];
                    array[i+1][0] = temp;
                    array[i+1][1] = temp1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int arraySize = input.nextInt();
        int[][] array = new int[arraySize][2];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < arraySize; i++) {
            array[i][0] = input.nextInt();
            array[i][1] = giveWeight(array[i][0]);
        }
        sortOnWeight(array);
        System.out.println("After sorting based on weights: ");
        System.out.println("value weights");
        for(int i = 0; i < arraySize; i++) {
            System.out.println(array[i][0] + "\t\t" + array[i][1]);
        }
    }
}
