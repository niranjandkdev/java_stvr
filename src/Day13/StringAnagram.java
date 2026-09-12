package Day13;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		String s="cat";
		String t="atc";
		boolean counter=false;
		
		char[] sArr=s.toCharArray();
		Arrays.sort(sArr);
		
		char[] tArr=t.toCharArray();
		Arrays.sort(tArr);
		
		
		for(int i=0;i<sArr.length;i++) {
			if(sArr[i]==tArr[i]) counter=true;
			
		}
		if(counter=true)System.out.println("true");
		
		else System.out.println("False");
	}


}
