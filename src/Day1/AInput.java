package Day1;

import java.util.Scanner;

public class AInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		
		char c=sc.next().charAt(0);
		
		if(c>='A' && c<='Z') {
			System.out.println("This is a upper case letter");
		}
		else if(c>='a' && c<='z'){
			System.out.println("This is a lower case letter");
		}
		else System.out.println("It is not a letter");
		

	}

}
