package Day15;

import java.util.Scanner;

public class stringBuilderReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		StringBuilder s=new StringBuilder(st);
		System.out.println("The stirng is"+s);
		StringBuilder n=new StringBuilder();
		
		
		for(int i=s.length()-1;i>0;i--) {
			char sat=s.charAt(i);
			StringBuilder seq=n.insert(i, sat);
			System.out.println(seq);
			
			 
			
			
		}
		
		System.out.println(s.charAt(1));
	}

}
