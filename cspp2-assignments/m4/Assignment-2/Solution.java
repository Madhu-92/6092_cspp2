/**
*scanner class.
*/
import java.util.Scanner;
/**
*solution class.
*/
public final class Solution {
    /**
    *Fill the main function to print resultant of addition of matrices
    */
    /**
    *constructor.
    */
    private Solution() {
        /**
        *this is a constructor.
        */
    }
    /** this is main method.
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int rowOne = s.nextInt();
        int columnOne = s.nextInt();
        int[][] matrixOne = new int[rowOne][columnOne];
        for (int i = 0; i < rowOne; i++) {
            for (int j = 0; j < columnOne; j++) {
                matrixOne[i][j] = s.nextInt();
            }
        }

        int rowTwo = s.nextInt();
        int coumnTwo = s.nextInt();
        int[][] matrixTwo = new int[rowTwo][coumnTwo];
        for (int i = 0; i < rowTwo; i++) {
            for (int j = 0; j < coumnTwo; j++) {
                matrixTwo[i][j] = s.nextInt();
            }
        }
        if (rowOne == rowTwo && columnOne == coumnTwo) {
            int[][] finalMatrix = new int[rowOne][columnOne];
            for (int i = 0; i < rowOne; i++) {
                for (int j = 0; j < columnOne; j++) {
                    finalMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                }
            }
            for (int i = 0; i < rowOne; i++) {
                for (int j = 0; j < columnOne - 1; j++) {
                    finalMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                    System.out.print(finalMatrix[i][j] + " ");
               }
                System.out.println(finalMatrix[i][columnOne - 1]);
            }
        } else {
            System.out.println("not possible");
        }
    }
}
