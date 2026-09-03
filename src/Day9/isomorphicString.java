package Day9;

public class isomorphicString {
	public static void main(String[] args) {
		String s="tata";
		String b="atab";
		boolean counter=false;
		
		char[] a=new char[128];
		for(int i=0;i<s.length();i++) {
			char sh=s.charAt(i);
			char bh=b.charAt(i);
			int idx=(int)sh;
			
				if(a[idx]=='\0') {a[idx]=bh; counter=true;}
				else {
					if(a[idx]!=bh) counter=false;
				}
			
			
		}
		if(counter=true) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
