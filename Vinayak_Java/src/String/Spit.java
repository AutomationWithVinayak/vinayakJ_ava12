package String;

public class Spit {

	public static void main(String[] args) {
		
		String sp="04/15/1994";  // 04
		                           // 15
		                           //1994
		
		
		// String sp2="07/08-1994";               
		
		    String [] sp1= sp.split("/");
		   
		
		
		for(int i=0; i<sp1.length; i++) {
			System.out.println(sp1[i]);
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(sp.replace("/", "-"));
		
		System.out.println(sp.replaceAll("04/15", "05/16"));
		
		
		
		//System.out.println(sp2.replace("/", "-"));
	//	String sp3 = sp2.replace("/", "-");
		
	//	System.out.println(sp3.replace("-", ".."));
			
		}
		
		
		
	}
	
	

	

