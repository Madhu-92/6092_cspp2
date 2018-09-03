/**.
 * Scanner class
 */
import java.util.Scanner;
/**.
 * Class for input validator.
 */
final class InputValidator {
    /**
     * { item_description }
     */
    /*Write the atrributes and methods for InputValidator*/
    static String input;
    private static final int SIX = 6;
    public InputValidator(final String input) {
        this.input = input;
    }
    boolean validateData() {
        return input.length() >= SIX;
    }

}
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
    * Empty constructor.
    */
    private Solution() {
        //not used.
    }

    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * { var_description }
         */
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}
