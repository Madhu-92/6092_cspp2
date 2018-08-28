/**
* Scanner class.
*/
import java.util.Scanner;
/**
* Solution class.
*/
public final class Solution {
    /**
    Do not modify this main function.
    */
    private Solution() {
        /* this is a constructor.
        */
    }
    /** this is method.
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /**
    *Need to write the power function and print the output.
    *@param base int
    *@param exponent int
    *@return power of two arguments
    */
    public static long power(final long base, final long exponent) {
        /*
        *power method.
        */
        if (exponent == 0) {
             return 1;
         } else if (exponent == 1) {
             return base;
         } else {
             return base * power(base, exponent - 1);
        }
    }
}

