//9. multiply two given matrix and print the result in the matrix format. (15 minutes).
import java.util.Scanner;
public class MatrixMultiplication {
    static void printmatrix(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void multiplyMatrices(int[][] matrix1, int[][] matrix2, int[][] finalMatrix) {
        for(int i = 0; i < finalMatrix.length; i++) {
            for(int j = 0; j < finalMatrix[0].length; j++) {
                for(int k = 0; k < matrix2.length; k++) {
                    finalMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        printmatrix(finalMatrix);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Matrix1 Dimensions: ");
        int matrix1Rows = input.nextInt();
        int matrix1Columns = input.nextInt();
        System.out.println("Enter matrix2 Dimensions: ");
        int matrix2Rows = input.nextInt();
        int matrix2Columns = input.nextInt();
        if(matrix1Columns != matrix2Rows) {
            System.out.println("Invalid dimensions to multiply matrices!");
            return;
        }
        int[][] matrix1 = new int[matrix1Rows][matrix1Columns];
        int[][] matrix2 = new int[matrix2Rows][matrix2Columns];
        int[][] finalMatrix = new int[matrix1Rows][matrix2Columns];
        System.out.println("Enter the elements of matrix one: ");
        for(int i = 0;i < matrix1Rows; i++) {
            for(int j = 0; j < matrix1Columns; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix two: ");
        for(int i = 0;i < matrix2Rows; i++) {
            for(int j = 0; j < matrix2Columns; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix 1: ");
        printmatrix(matrix1);
        System.out.println("Matrix 2: ");
        printmatrix(matrix2);
        System.out.println("Final matrix: ");
        multiplyMatrices(matrix1, matrix2, finalMatrix);
    }
}
