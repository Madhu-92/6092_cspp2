import java.util.Scanner;

class FirstLast{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
            if (a[0] == 6 || a[n-1] == 6) {
                System.out.println("True");
            }
            else {
            	System.out.println("False");
            }
        
	}
}