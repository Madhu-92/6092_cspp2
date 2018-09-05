/**
* Scanner class.
*/
import java.util.Scanner;
/**
*Do not modify this main function.
*Solution class
*/
public final class Solution {
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
        int numberOne = s.nextInt();
        int numberTwo = s.nextInt();
        System.out.println(gcd(numberOne, numberTwo));
    }
    /**
    *Need to write the gcd function and print the output.
    *@param numberOne int
    *@param numberTwo int
    *@return power of two arguments
    */
    public static int gcd(final int numberOne, final int numberTwo) {
        /**
        *gcd method.
        */
        if (numberOne == 0 || numberTwo == 0) {
            return 0;
        }
        if  (numberOne == numberTwo) {
            return numberOne;
        }
        if (numberOne > numberTwo) {
            return gcd(numberOne - numberTwo, numberTwo);
        }
        return gcd(numberOne, numberTwo - numberOne);
    }
}
