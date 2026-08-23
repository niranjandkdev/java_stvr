package Day3;

public class CCountingDigit {

	//This counts digits using logarithms
	public static void main(String[] args) {
		int num = 54876;
		int count;



		if (num == 0) {
			count = 1;
		} 


		else {
			count = (int) Math.log10(Math.abs(num)) + 1;
		}
		System.out.println("number of digits are: " + count);
	}

}
