package Day2;

import java.util.Scanner;

public class BArray {

	public static void main(String[] args) {
		int[] a;
		a= new int[5];
		System.out.println("Welcome");
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter elements for index"+i);
		int n=sc.nextInt();
		a[i]=n;
		
		}
		
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]);
			
		}
		
		System.out.println("This is array last index"+a[4]);
		
	}

}
