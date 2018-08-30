
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a[];
		int temp=0;
		a = new int[n];
		for (int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
			if (temp<a[i]) {
				temp=a[i];
			}
		}System.out.println(temp);
	}
}
