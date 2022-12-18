package String;


public class methods_13 {
	
	
	public static void main(String[] args) {
		
	

	String s1="Velocity";

	
	System.out.println("index : "+s1.charAt(2));
	System.out.println("index : "+s1.charAt(5));
	System.out.println("total length is : "+s1.length());
	System.out.println();
	
	String s2="velocity";
	
	System.out.println(	s1.equalsIgnoreCase(s2)+"mahavir sir");
	String s3="Velocity";
	
	String s4=new String("Velocity");
	
	System.out.println(s2.equals(s3));
	System.out.println(s2.equals(s4));
	System.out.println();
	
	
	String s5="java";
	String s6="";
	
	System.out.println(s5.isEmpty());
	System.out.println(s6.isEmpty());
	System.out.println();
	
	
	String s7="Velocityc";
	String s8="27-02-2002";
	
	System.out.println(s7.replace("c", "s"));
	System.out.println(s7.replace('e', 'E'));
	System.out.println(s8.replace("-", "/"));
	System.out.println();
	
	
	String s9="python java class";          
	
	System.out.println(s9.replaceAll("python", "core"));
	System.out.println(s9.replaceAll(" ", ""));
	System.out.println();
	
	
	String s10="Velocity classes";
    
	System.out.println(s10.substring(4, 8));
	System.out.println(s10.substring(9, 14));
	System.out.println();
	
	
    String s11="Python tube Python t y";  // it imp bcus it take time fr practice
    
    
    System.out.println(s11.indexOf('t'));
 	System.out.println(s11.indexOf('t',s11.indexOf('t',s11.indexOf('t')+1)+1));	
 	System.out.println(s11.indexOf('t',s11.indexOf('t')+1));
 	System.out.println(s11.indexOf('t' , s11.indexOf('t' , s11.indexOf('t', s11.indexOf('t')+1)+1)+1));
	System.out.println(s11.indexOf('y'));
	System.out.println(s11.indexOf('y' , s11.indexOf('y')+1));
	System.out.println(s11.indexOf('y', s11.indexOf('y' , s11.indexOf('y')+1)+1));
	System.out.println();
	System.out.println(s11.indexOf('t',s11.indexOf('t')+1));
	System.out.println();
	
	
	String s12="Python_01_n";
	
	System.out.println(s12.lastIndexOf('n'));
	System.out.println();
	
	
	
    String s13="    good  morning   ";
    
    System.out.println(s13.trim());
    System.out.println();
    
    
    
    
    
    String s14="*s help me always*";
    
    String s15[]=s14.split(" ");
	for(int i=0; i<s15.length; i++) {
		System.out.println(s15[i]);
		
	}
	System.out.println();
	
	
	
	
	
	String s16="velocity class";
	
	System.out.println(s16.toUpperCase());
	System.out.println();
	
	
	String s17="LONAR LAKE";
	
	System.out.println(s17.toLowerCase());
	System.out.println();

	
	
	

 
	  
 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
}
