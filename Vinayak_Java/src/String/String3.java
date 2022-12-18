package String;


public class String3 {
	
	// String is immutable means not changeable
	

	public static void main(String[] args) {
		
		String s1=new String("java");
		String s2=new String("java");
		
		String s3="java";
		String s4="java";
	
		s1.concat("paython");
		System.out.println(s1);
		s1=s1.concat("C++");
		
		System.out.println(s1);
		
		System.out.println();
		System.out.println(s4);
		s4=s4.concat("python");
		
		
		System.out.println(s4);
		
		System.out.println(s2);
		System.out.println(s3);
	}
}
