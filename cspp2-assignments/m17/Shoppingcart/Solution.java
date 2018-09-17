import java.util.Scanner;
/**.
 * { item_description }
 */
final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        int k = 1;
        ShoppingCart shoppingObject = new ShoppingCart();
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        for (int i = 0; i <= lines; i++) {
            String[] tokens = scan.nextLine().split(" ");
            switch (tokens[0]) {
            case "Item":
                String[] items = tokens[1].split(",");
                shoppingObject.addToCatalogue(new Item(items[0],
                                        Integer.parseInt(
                                            items[1]),
                                        Double.parseDouble(
                                            items[2])));
                break;
            case "catalog":
                shoppingObject.showCatalogue();
                break;
            case "add":
                items = tokens[1].split(",");
                shoppingObject.addToCart(new Item(items[0],
                                     Integer.parseInt(
                                         items[1])));
                break;
            case "show":
                shoppingObject.showCart();
                break;
            case "totalAmount":
                System.out.println(
                    "totalAmount: " + shoppingObject.getTotalAmount());
                break;
            case "remove":
                items = tokens[1].split(",");
                shoppingObject.removeFromCart(new Item(items[0],
                                          Integer.parseInt(
                                              items[1])));
                break;
            case "payableAmount":
                System.out.println(
                    "Payable amount: " + shoppingObject.getPayableAmount());
                break;
            case "print":
                shoppingObject.printInvoice();
                break;
            case "coupon":
                while (k == 1) {
                    shoppingObject.applyCoupon(tokens[1]);
                    k++;
                    break;
                }
                break;
            default:
                break;
            }
        }
    }
}
