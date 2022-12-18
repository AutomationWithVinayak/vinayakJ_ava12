package String;

public class Reverse {
	
	public static void main(String[] args) {

		String viki="vinayak";
		
		System.out.println();
		
		int size=viki.length();
		
		String rev ="";
		
		
		for(int i=size-1; i>=0; i--) {
			
			rev=rev+viki.charAt(i);
			
		
		}
		System.out.println(rev);
		
		String a ="vicky";
		String r="";
		int l=a.length();
		
		for(int j=l-1; j>=0;  j--) {
			
			r=r+a.charAt(j);
		
			
		}
		System.out.println(r);
		
		
	}
	

}
