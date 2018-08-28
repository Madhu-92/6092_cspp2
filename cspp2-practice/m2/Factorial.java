import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(fact(a));
			
	}

	public static int fact(int a) {

        if(a==0 || a==1)
		    return 1;
	    else 
		    return a*fact(a-1);

	}

}
