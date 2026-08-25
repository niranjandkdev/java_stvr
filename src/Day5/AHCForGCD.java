package Day5;

import java.util.Scanner;

public class AHCForGCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		int gcd=1;
		
		//Find the smaller number
		
		int min=Math.min(a, b);
		System.out.println(min);
		
		for(int i=1;i<=min;i++) {
			
			
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD="+gcd);
		

	}

}
