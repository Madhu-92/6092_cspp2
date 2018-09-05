/**
*scanner class.
*/
import java.util.Scanner;
/**
*solution class.
*/
public final class Solution {
    /**
    *Do not modify the main function
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
     * In this it calls reverseString method.
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String strObj = sc.nextLine();
        String reverse = reverseString(strObj);
        System.out.println(reverse);
    }
    //Write reverseString function
    /** this is main method.
    *@param strObj String
    *@return tag
    */
    public static String reverseString(final String strObj) {
        String reverse = "";
        for (int i = strObj.length() - 1; i >= 0; i--) {
            reverse = reverse + strObj.charAt(i);
        }
        return reverse;
    }
}
