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
        int numberOne = scan.nextInt();
        int numberTwo = scan.nextInt();
        int numberThree = scan.nextInt();
        roots(numberOne, numberTwo, numberThree);
    }
    /**
    *Need to write the rootsOfQuadraticEquation function.
    *and print the output.
    *@param numberOne int
    *@param numberTwo int
    *@param numberThree int
    */
    public static void roots(final int numberOne, final int numberTwo, final int numberThree) {
        /*
        *rootsof quadratic equation method.
        */
        double x = (-numberTwo + Math.sqrt(numberTwo * numberTwo - 2 * 2 * numberOne * numberThree)) / (2 * numberOne);
        double y = (-numberTwo - Math.sqrt(numberTwo * numberTwo - 2 * 2 * numberOne * numberThree)) / (2 * numberOne);
        System.out.println(x + " " + y);
    }
}
