package Day5;

import java.util.Scanner;

public class BRecursionName {
	
	static void printName(int n) {
		
		if(n==0) {
			return;
		}
		
		System.out.println("FirstName");
		
		printName(n-1); //This function is called as recursive call function, decreases n by 1
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter times to repeat");
		
		int n=sc.nextInt();
		
		printName(n);
		

	}

}
