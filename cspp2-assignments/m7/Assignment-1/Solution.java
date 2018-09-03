/**.
 * Scanner class
 */
import java.util.*;
/**.
 * Class for input validator.
 */
class InputValidator {
    /**
     * { item_description }
     */
    /*Write the atrributes and methods for InputValidator*/
    static String input;
    public InputValidator(String input) {
        this.input = input;
    }
    boolean validateData() {
        if (input.length() >= 6) {
            return true;
        } else {
            return false;
        }
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
