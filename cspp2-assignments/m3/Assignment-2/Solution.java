/**
* Scanner class.
*/
import java.util.Scanner;
/**
*Do not modify this main function.
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
    *Fill the main function to print the number of 7's between 1 to n.
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i, count = 0;
        for (i = 7; i < n; i++) {
            int temp = i;
            while (temp >= 7) {
                if (temp % 10 == 7) {
                   count += 1;
                }
                temp /= 10;
            }
        }
        System.out.println(count);
    }
}
