package Day7;

public class IReverseArray {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		System.out.println(arr.length);
		
		for(int i=arr.length;i>0;i--) {
			System.out.println(arr[i-1]+" ");
		}

	}

}
