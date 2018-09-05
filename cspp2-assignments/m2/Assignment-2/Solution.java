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
        /* this is a empty constructor.
        */
    }
    /** this is main method.
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();
        int numThree = scan.nextInt();
        roots(numOne, numTwo, numThree);
    }
    /**
    *Need to write the rootsOfQuadraticEquation function.
    *and print the output.
    *@param numOne int
    *@param numTwo int
    *@param numThree int
    */
    public static void roots(final int numOne, final int numTwo, final int numThree) {
        /*
        *rootsof quadratic equation method.
        */
        double x = (-numTwo + Math.sqrt(numTwo * numTwo - 2 * 2 * numOne * numThree)) / (2 * numOne);
        double y = (-numTwo - Math.sqrt(numTwo * numTwo - 2 * 2 * numOne * numThree)) / (2 * numOne);
        System.out.println(x + " " + y);
    }
}
