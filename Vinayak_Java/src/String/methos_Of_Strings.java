package String;

public class methos_Of_Strings {
	
	public static void main(String[] args) {
		
		String s=new String("vicky");
		String s1=new String("vicky");
		
		
		System.out.println(s==s1);     //output us false  --   // both print --- "vicky" ; but there loction adress are not same means s&s1 are allocated at dif diff place 
		System.out.println(s.equals(s1)); // output is true -- // it depends upon olny contents and contends are same 
		System.out.println();
		
		
		String s2="vicky";
		String s3="vicky";
		
		System.out.println(s2==s3);   //output is true  --  // both memory location object and contents are same in s2&s3 hence it print true
		System.out.println(s2.equals(s3)); // output is true -- contends are same
		
		
	}

}
