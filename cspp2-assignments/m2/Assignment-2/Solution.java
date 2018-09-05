/**
* Scanner class.
*/
import java.util.Scanner;
/**
* Solution class.
*/
public final class Solution {
    /**
    *Do not modify this main function.
    */
    private Solution() {
        /* this is a constructor.
        */
    }
    /** this is method.
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int numA = scan.nextInt();
        int numB = scan.nextInt();
        int numC = scan.nextInt();
        roots(numA, numB, numC);
    }
    /**
    *Need to write the rootsOfQuadraticEquation function.
    *and print the output.
    *@param numA int
    *@param numB int
    *@param numC int
    */
    public static void roots(final int numA, final int numB, final int numC) {
        /*
        *rootsof quadratic equation method.
        */
        double x = (-numB + Math.sqrt(numB * numB - 2 * 2 * numA * numC)) / (2 * numA);
        double y = (-numB - Math.sqrt(numB * numB - 2 * 2 * numA * numC)) / (2 * numA);
        System.out.println(x + " " + y);
    }

}
