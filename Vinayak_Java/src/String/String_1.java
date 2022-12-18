package String;



public class String_1 {
	
	
	// ******memory allocation******
	
	
	public static void main(String[] args) {
		
		String s=new String("viki");      // decleare with new keyword ----- heap memory
		String s1="viki";                  //  decleared without new keyword--------string constant pool memory
		
			
		System.out.println(s);
		System.out.println(s1);
		
	}

}
