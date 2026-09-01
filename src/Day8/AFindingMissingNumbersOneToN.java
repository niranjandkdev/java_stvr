package Day8;

public class AFindingMissingNumbersOneToN {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6};
		
		int total=0;
		int NumTotal=0;
		
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
			
		}
		for(int j=0;j<=6;j++) {
			NumTotal=NumTotal+j;
		}
		System.out.println("Missing number is "+(NumTotal-total));
	}

}
