package functions;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int a = input.nextInt();
		System.out.println("Enter Number 2: ");
		int b = input.nextInt();
		System.out.println("Enter Number 3: ");
		int c = input.nextInt();
		int max = max(a,b,c);
		int min = min(a,b,c);
		System.out.println("Max="+max+" Min="+min);

	}
	
	static int max(int a, int b, int c) {
		
		int max = a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		return max;
		
		
	}
	
	static int min(int a, int b, int c) {
		
		int min = a;
		if(b<min) {
			min=b;
		}
		if(c<min) {
			min=c;
		}
		return min;
		
	}

}
