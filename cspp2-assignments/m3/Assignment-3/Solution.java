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
    /** this is method.
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1, n2));
    }
    /**
    *Need to write the gcd function and print the output.
    *@param n1 int
    *@param n2 int
    *@return power of two arguments
    */
    public static int gcd(final int n1, final int n2) {
        /**
        *gcd method.
        */
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        if  (n1 == n2) {
            return n1;
        }
        if (n1 > n2) {
            return gcd(n1 - n2, n2);
        }
        return gcd(n1, n2 - n1);
    }
}
