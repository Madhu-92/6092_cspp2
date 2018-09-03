/**
 * Scanner class
 */
import java.util.Scanner;
/**
 * Class for input validator.
 */
    class InputValidator {
    /*Write the atrributes and methods for InputValidator*/
    /**
     * { var_description }.
     */
    static String input;
    /**
     * { var_description }.
     */
    private static final int SIX = 6;
    /**
     * Constructs the object.
     *
     * @param      input  The input
     */
    InputValidator(final String inputt) {
        this.input = inputt;
    }
    boolean validateData() {
        return input.length() >= SIX;
    }

}
/**
 * Class for solution.
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used.
    }

    /**
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
