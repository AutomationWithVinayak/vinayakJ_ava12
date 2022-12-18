package String;

public class String_2 {
	
	// mempry allocation
	public static void main(String[] args) {
		
		String s1=new String("java");
		String s2=new String("java");     //------scp--1"java" store s1,s2,s3(it is refreance memory for future uses)
		String s3=new String("java");
		
		String s4="java";
		String s5="java";             //-----------store in heap seprete seprete(it is t constatnt memory)
		String s6="java";             // -------- java---s4_____java---s5________java---s6
		
		
		
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println();
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		
		
		
	}

}
