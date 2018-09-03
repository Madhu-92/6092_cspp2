/**
 * Scanner class
 */
import java.util.*;
/**
 * Class for input validator.
 */
class InputValidator {
    /*Write the atrributes and methods for InputValidator*/
    static String input;
    public InputValidator(String input) {
        this.input = input;
    }
    boolean validateData() {
        if (input.length() > 6) {
            return true;
        } else {
            return false;
        }
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
    * main method as driver program.
    * @param args is the parameter for this method.
    */

    public static void main(final String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }

}
