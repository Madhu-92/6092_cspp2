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
    *@param args String
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    //Write reverseString function
    /** this is main method.
    *@param s String
    *@return tag
    */
    public static String reverseString(final String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }
}
