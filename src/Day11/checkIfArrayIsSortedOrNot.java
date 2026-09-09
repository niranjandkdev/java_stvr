package Day11;

public class checkIfArrayIsSortedOrNot {

	public static void main(String[] args) {
		int[] arr= {1,7,3,8,9,12};
		int n=arr.length;
		
		
		boolean flag=true;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				
				
				flag=false;
				break;
			}
			else {
				flag=true;
				
			}
		}
		if(flag==true) System.out.println("array is sorted");
		
		
		else System.out.println("array is not sorted");

	}

}
