package Day4;

import java.util.Scanner;

public class DPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		int num=n;
		boolean result=false;
		
		while(n>1) {
			
			if(num%num==0 && num%n==0 ) {
				result=false;
				
			} else result=true;
			n--;
		}
		
		System.out.println(result);

	}

}
