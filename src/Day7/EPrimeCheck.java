package Day7;

public class EPrimeCheck {

	public static void main(String[] args) {
		int num=4;
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println("It's a prime number");
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}
