import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : 
 */
class Set {
    //your code goes here...
    //Good luck :-)
    
    private int[] list;
    private int size;
    
    public Set() {
        list = new int[10];
        size = 0;
    }

    public int size() {
        return size;
    }
    public boolean contains(final int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return true;
            }   
        }
        return false;
    }
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
    public void add(final int item) {
      // if (size == 0) {
      //       return "{}";
      //   }
      //   String str = "{";
        for (int i = size; i < list.length; i++) {
            list[size] = item;
        }
    }
    public void add(final int[] items) {
        for (int i = 0; i < items.length; i++) {
            list[size] = items[i];
            size++;
        }
    }
    // public void intersection(final int[] items) {
    // set s1 = new set();
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