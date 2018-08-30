/**
*scanner class.
*/
import java.util.Scanner;
/**
*solution class.
*/
public final class Solution {
    /**
    *Fill the main function to print resultant of addition of matrices
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
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }

        int p = s.nextInt();
        int q = s.nextInt();
        int[][] b = new int[p][q];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j] = s.nextInt();
            }
        }
        if (m == p && n == q) {
            int[][] c = new int[m][n];
            for (int i = 0 ;i < m; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n - 1; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                    System.out.print(c[i][j] + " ");
               }
                System.out.println(c[i][n - 1]);
            }
        }
        else {
            System.out.println("not possible");
        }
    }
}