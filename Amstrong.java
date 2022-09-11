package firstjava;
import java.util.Scanner;
import java.lang.Math;

public class Amstrong {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		int num;
		int temp;
		
		for(int i = a;i<=b;i++) {
			int digits=0;
			temp=i;
			while(temp>0) {
				temp = temp/10;
				digits++;
			}
			
			int sum=0;
			temp=i;
			while (temp>0) {
				
				
				sum+=Math.pow(temp%10,digits);
				
				temp=temp/10;
				
				
			}
			
			
			
			if (sum==i) {
				System.out.print(i + " ");
			}
			
		}
		
		
		
		
	}

}
