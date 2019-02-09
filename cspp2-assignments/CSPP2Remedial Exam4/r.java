public class r {
	public static void main(String[] args) {
		int[] a = [1,2,3,4,5,6,7,8,9,10];
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (temp < a[i]) {
				temp = a[i];
			}
		}
		System.out.println(temp);
	}
}