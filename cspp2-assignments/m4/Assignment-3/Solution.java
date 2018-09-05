/** Given an String, Write a java method that returns the.
*decimal value for the given binary string.
/**
*scanner class.
*/
import java.util.Scanner;
/**
*solution class.
*/
public final class Solution {
    /*
    Do not modify this main function.
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
     * in this method it calls binaryToDecimal method.
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String givenString = sc.next();
            int res = binaryToDecimal(givenString);
            System.out.println(res);
        }
    }
    /**
     * this is binaryToDecimal method.
    *@param givenString String
    *@return returns the decimal number for the binary value.
    */
    public static int binaryToDecimal(final String givenString) {
        return (Integer.parseInt(givenString, 2));
    }

}
