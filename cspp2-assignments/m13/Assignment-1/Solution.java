import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author     :
 */
class Set {
    //your code goes here...
    //Good luck :-)
    /**
    * Declaration of list.
    */
    private int[] list;
    /**
    * Declaration of size.
    */
    private int size;
    /**
     * assigning value.
     */
    private static final int TEN = 10;
    /**
     * Constructs the object.
     */
    Set() {
        list = new int[TEN];
        size = 0;
    }
    /**
     * size method.
     *
     * @return     size
     */
    public int size() {
        return size;
    }

    /**
     * contains method.
     *
     * @param      item  The item
     *
     * @return     true or false
     */
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size == 0) {
            return "{}";
        }
        String str = "{";
        for (int i = 0; i < size - 1; i++) {
            str += list[i] + ",";
        }
        str += list[size - 1] + "}";
        return str;
    }

    /**
     * Add the given integer to the Set if it is not already present.
     *
     * @param      item  The item
     */
    public void add(final int item) {
        list[size] = item;
        size++;
    }

    
    /**
     * resize method.
     *
     * @return     list2
     */
    public int[] resize() {
        int[] list2 = new int[size * 2];
        for (int i = 0; i < size; i++) {
            list2[i] = list[i];
        }
        return list2;
    }
    /**
     * Add the items given in the int array to.
     * the Set if they are not already present.
     *
     * @param      items  The items
     */
    public void add(final int[] items) {
        for (int i = 0; i < items.length; i++) {
            list[size] = items[i];
            size++;
            if (size > list.length / 2) {
                list = resize();
            }
        }
    }
    // public void intersection(final int[] items) {
    // set s1 = new set();
    // boolean check;
    // int f = 0;
    // int list1 = new list
    //  int[] newarr = new int[10];
    //  for (int i = 0; i < size; i++) {
    //      for (int j = 0; j < items.length; j++) {
    //      if (list[i] == items[j]) {
    //          newarr = list[i];
    //      }
    //  }
    //  }
    // }

}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                // case "intersection":
                // s = new Set();
                // Set t = new Set();
                // intArray = intArray(tokens[1]);
                // s.add(intArray);
                // intArray = intArray(tokens[2]);
                // t.add(intArray);
                // System.out.println(s.intersection(t));
                // break;
                // case "retainAll":
                // s = new Set();
                // intArray = intArray(tokens[1]);
                // s.add(intArray);
                // intArray = intArray(tokens[2]);
                // System.out.println(s.retainAll(intArray));
                // break;
                // case "cartesianProduct":
                // s = new Set();
                // t = new Set();
                // intArray = intArray(tokens[1]);
                // s.add(intArray);
                // intArray = intArray(tokens[2]);
                // t.add(intArray);
                // System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                // break;
                default:
                break;
            }
        }
    }
}
