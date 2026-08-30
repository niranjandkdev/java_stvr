package Day7;

public class JSortAscending {
	// Change 3rd for loop for sorting in descending order
	public static void main(String[] args) {
		int[] arr= {10,30,40,20};
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+" ");
			
		}

	}

}
