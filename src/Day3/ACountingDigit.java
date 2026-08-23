package Day3;

import java.util.Scanner;

public class ACountingDigit {



	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;



		n=Math.abs(n);	//If the number is negative converts to positive



		if(n==0) {//If the number is zero
			count=1;
		}
		else {

			while(n!=0) {//For positive numbers
				n=n/10;

				count+=1;


			}
		}
		System.out.println("Number of digits are: "+count);

	}

}
