package functions;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		
		System.out.println('c'-'a');
		
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		check(age);

	}

	static void check(int age) {
		
		if(age>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
	}
}
