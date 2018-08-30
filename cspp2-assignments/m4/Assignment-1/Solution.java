/**
*scanner class.
*/
import java.util.Scanner;
/**
*solution class
*/
public final class Solution {
    /**
    *Fill this main function to print maximum of given array
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
        int a[];
        int temp = 0;
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (temp < a[i]) {
                temp = a[i];
            }
        }
        System.out.println(temp);
    }
}
