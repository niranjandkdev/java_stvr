package Day15;

import java.util.Scanner;

public class toggleChars {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		int n=sb.length();
		
		
		for(int i=0;i<n;i++) {
			char ch=sb.charAt(i);
			int aschii=(int)ch;
			if(aschii>=65 && aschii<=90) {
				aschii+=32;
				ch=(char) aschii;
				sb.setCharAt(i, ch);
				
			}
			else if(aschii>=97 && aschii<=122) {
				aschii-=32;
				ch=(char)aschii;
				sb.setCharAt(i, ch);
			}
		}
		System.out.println(sb);
	}

}
