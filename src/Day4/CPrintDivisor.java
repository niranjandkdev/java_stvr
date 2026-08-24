package Day4;

import java.util.Scanner;

public class CPrintDivisor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the number");
		int n=sc.nextInt();
		int pointer=0;
		int num=n;
		
		while(n>0) {
			
			if(num%n==0) {
				System.out.println(n);
				
			}
			n--;
			
		}

	}

}
