package Day10;

import java.util.Scanner;

public class maxOccurring {
	
	public static void main(String[] args) {
//		String s="niranjan";
//		int count=0;
//		char[] ss=s.toCharArray();
//		char[] alpha= {'a','i','r','n','j'};
//		
//		for(int i=0;i<alpha.length;i++) {
//			for(int j=0;j<ss.length;j++) {
//				if(ss[j]==alpha[i]) {
//					count+=1;
//					
//				}
//			}
//			System.out.println(alpha[i]+" "+count);
//			count=0;
//		}
//		
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int[] freq=new int[26];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int idx=(int)ch-97;
			freq[idx]++;
		}
		int maxFreq=-1;
		for(int i=0;i<freq.length;i++) {
			maxFreq=Math.max(maxFreq, freq[i]);
			System.out.print(maxFreq);
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==maxFreq) {
				char ch=(char)(i+97);
				System.out.print(ch+" ");
			}
		}
		

	}

}
