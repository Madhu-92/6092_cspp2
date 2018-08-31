import java.util.Scanner;
class Average{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n ;i++ ) {
			a[i]=s.nextInt();
		}
		int temp=0;
		for (int j=0;j<n ;j++ ) {
			temp += a[j];
		}System.out.println(temp / n);
	}
}