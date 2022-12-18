package String;

public class reversstring0 {
	public static void main(String[] args) {
		
		String s="viki";
		
		String l="";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			l=l+s.charAt(i);
			
		}
		System.out.println(l);
	}

}
