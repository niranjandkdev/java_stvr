package Day4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rev=0;
		int ncompare=n;
		
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
			
			
		}
		
		if(ncompare==rev) {
			System.out.println("The given number is a palindrome");
		}
		else System.out.println("The given number is not a palindrome");
		

	}

}
