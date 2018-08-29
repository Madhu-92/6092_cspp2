/**
* Scanner class.
*/
import java.util.Scanner;
/**
*Do not modify this main function.
*/
public final class Solution {
    /**
    *Do not modify this main function.
    *Magic numbers
    */
    static final int SEVEN = 7, TEN = 10;
    /**
    *Empty constructor.
    */
    private Solution() {
        /**
        *Empty constructor.
        */
    }
    /** this is method.
    *@param args String
    *Fill the main function to print the number of 7's between 1 to n.
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i, count = 0;
        for (i = SEVEN; i < n; i++) {
            int temp = i;
            while (temp >= SEVEN) {
                if (temp % TEN == SEVEN) {
                   count += 1;
                }
                temp /= TEN;
            }
        }
        System.out.println(count);
    }
}
