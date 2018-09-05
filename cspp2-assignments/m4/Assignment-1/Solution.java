/**
*scanner class.
*/
import java.util.Scanner;
/**
*solution class.
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
        int sizeOfArray = sc.nextInt();
        int[] arrayOfNumbers;
        int temp = 0;
        arrayOfNumbers = new int[sizeOfArray];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = sc.nextInt();
            if (temp < arrayOfNumbers[i]) {
                temp = arrayOfNumbers[i];
            }
        }
        System.out.println(temp);
    }
}

