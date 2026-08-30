package Day7;

public class SwalpTwoNumbersWithOutTempVar {

	public static void main(String[] args) {
		int a=3;
		int b=7;
		
		a=a+b;  //7+3=10
		b=a-b;	//10-7=3
		a=a-b;	//10-3=7
		System.out.println(a);
		System.out.println(b);

	}

}
