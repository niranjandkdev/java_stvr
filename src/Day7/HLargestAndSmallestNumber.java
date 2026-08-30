package Day7;

import java.util.Scanner;

public class HLargestAndSmallestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("ENter the elements into the array");
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=0;i<n;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(largest);
		
		System.out.println(smallest);
		
		

	}

}
