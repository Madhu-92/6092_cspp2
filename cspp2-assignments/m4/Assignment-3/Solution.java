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
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int res = binaryToDecimal(s); //Write binaryToDecimal function
            System.out.println(res);
        }
    }
    /** this is main method.
    *@param s String
    *@return 
    */
    public static int binaryToDecimal(final String s) {
        return (Integer.parseInt(s, 2));
    }

}
