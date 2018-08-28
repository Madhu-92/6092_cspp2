/**
* Scanner class.
*/
import java.util.Scanner;
/**
* Solution class.
*/
public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(final String[] args) {
		/*
	    *main method
	    */
		Scanner scan = new Scanner(System.in);
		/**
        * @param a int
        */
		int a = scan.nextInt();
		/**
        * @param b int
        */
		int b = scan.nextInt();
		/**
        * @param c int
        */
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/**
	*Need to write the rootsOfQuadraticEquation function
	*and print the output.
	*/
	public static void rootsOfQuadraticEquation(final int a, final int b, final int c) {
		/*
	    *rootsof quadratic equation method
	    */
		double x = (-b + Math.sqrt(b * b - 2 * 2 * a * c)) / (2 * a);
		double y = (-b - Math.sqrt(b * b - 2 * 2 * a * c)) / (2 * a);
		System.out.println(x + " " + y);
	}

}
