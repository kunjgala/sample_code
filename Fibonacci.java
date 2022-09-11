package firstjava;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		int[] fib = new int[n+2];
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<=n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		
		for(int j=0;j<=n;j++) {
			System.out.print(fib[j] + " ");
		}
	}

}
