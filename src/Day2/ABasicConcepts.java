package Day2;

import java.util.Scanner;

public class ABasicConcepts {
	
	//This contains all basic important concepts

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter intervel");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		System.out.println("This is an example for do while");
		do {
			System.out.println(a);
			b--;
			a++;
		}while(b>=0); 
		
		int i=5;
		
		System.out.println("This is an example for while");
		
		while(i>0) {
			System.out.println(i);
			i-=2;
			
		}
		
		System.out.println("This an example for 'for' loop and if else");
		for(int j=1;j<=10;j++) {
			System.out.println(2+"X"+j+"="+(2*j));
			
			if((2*j)<10) {
				System.out.println("This is single digit number");
			}
			
			else if((2*j)>10) {
				System.out.println("This is double digit number");
			}
			else System.out.println("This is divisible by 10");
			
		}
		
		
		System.out.println("This is an example for switch statement");
		int day=3;
		
		switch (day) {
		case 1: {
			System.out.println("This is day"+day);
			break;
			
		}
		case 2: {
			System.out.println("This is day"+day);
			break;
		}
		default:
			System.out.println("This is invalid");
			
		}
		
		System.out.println("This an example for ternary operator");
		int v=6;
		int w=8;
		String n=v>w?"a is greater":"b is greater";
		System.out.println(n);
	}

}
