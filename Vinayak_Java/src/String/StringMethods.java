package String;

public class StringMethods {
	public static void main(String[] args) {
	String s1=new String ("java");
	String s2=new String ("java");
	
	System.out.println(s1==s2); ///----false  ((s1&s2 point)becuse in this always compare adress comparision)
	
	System.out.println(s1.equals(s2));  //-- true(conpare contain ("java"/"java"))
	

	
	String s5="java";   
	String s6="java";
	
	System.out.println(s5==s6);          //-- true becuase there location id &  contain "java"  are same ;this is constant
	System.out.println(s5.equals(s6));    //-- true -- contain are same
}
}
