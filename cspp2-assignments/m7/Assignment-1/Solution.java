/**
 * Scanner class.
 */
import java.util.Scanner;
/**
 * Class for input validator.
 */
    class InputValidator {
    /*Write the atrributes and methods for InputValidator*/
    /**
     * input declaration.
     */
    private String input;
    /**
     * Magic number intialization.
     */
    private static final int SIX = 6;
    /**
     * Constructs the object.
     *
     * @param      inputt  The input.
     */
    InputValidator(final String inputt) {
        this.input = inputt;
    }
    /**
     * validateData method
     *
     * @return     returns either true or false.
     */
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
     * Main method.
     * In this method it calls InputValidator and valiData
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner obj = new Scanner(System.in);
        String input = obj.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}
