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
		Scanner scan = new Scanner(System.in);
		/**
        * @param a
        */
		int a = scan.nextInt();
		/**
        * @param b
        */
		int b = scan.nextInt();
		/**
        * @param c
        */
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
	public static void rootsOfQuadraticEquation(int a, int b, int c) {
		double x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		double y = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.println(x + " " + y);
	}

}