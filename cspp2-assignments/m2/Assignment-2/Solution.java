/**
* Scanner class.
*/
import java.util.Scanner;
/**
* Solution class.
*/
public class Solution {
    /**
    *Do not modify this main function.
    */
    /**
    *@param args int
    */
    public static void main(final String[] args) {
        /*
        *main method
        */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
    }
    /**
    *Need to write the rootsOfQuadraticEquation function
    *and print the output.
    *@param a int
    *@param b int
    *@param c int
    */
    public static void roots(final int a, final int b, final int c) {
        /*
        *rootsof quadratic equation method
        */
        double x = (-b + Math.sqrt(b * b - 2 * 2 * a * c)) / (2 * a);
        double y = (-b - Math.sqrt(b * b - 2 * 2 * a * c)) / (2 * a);
        System.out.println(x + " " + y);
    }

}
