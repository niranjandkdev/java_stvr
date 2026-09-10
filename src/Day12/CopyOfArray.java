package Day12;

import java.util.Arrays;

public class CopyOfArray {
	
	public static void main(String[] args) {
		int[] arr= {40,10,20,89,30};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------");
		int[] nums=arr;
		
		
		for(int j=0;j<nums.length;j++) {
			System.out.println(nums[j]);
		}
		System.out.println("---------");
		int[] brr=Arrays.copyOf(arr, arr.length);
		
		for(int ele:brr) {
			System.out.println(ele);
		}
	}

}
