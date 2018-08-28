import java.util.Scanner;

public class BiggerEqualSmall {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if(a > b){
			System.out.println("Bigger");
		}
		else if(a == b){
			System.out.println("Equal");
		}
		else if(a < b){
			System.out.println("Small");
		}

	}

}
