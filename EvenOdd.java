package functions;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		System.out.println(check(a));
		

	}
	
	static boolean check(int a) {
	
		
		return a%2==0;
		
	}

}
