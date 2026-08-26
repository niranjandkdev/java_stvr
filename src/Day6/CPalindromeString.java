package Day6;

public class CPalindromeString {

	public static void main(String[] args) {
		String s="MADAM";

		char[] ch=s.toCharArray();

		String rev="";
		for(int i=ch.length-1;i>0;i--) {
			rev=rev+ch[i];
		}

		if(s==rev) {
			System.out.println("Palindrome");
		} else System.out.println("Not a palindrome");


	}

}
