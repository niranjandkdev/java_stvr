package Day7;

public class KFindingTheDuplicates {
	public static void main(String[] args) {
		int[] arr= {10,20,10,30,30};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
			
		}
	}
	

}
