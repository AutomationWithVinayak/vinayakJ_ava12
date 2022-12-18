package String;

public class Concat {
	
	public static void main(String[] args) {
		
		String ob="abc";
		String ob1="def";
		
		int ob2= 10;
		int ob3=20;
		
		System.out.println(ob.concat(ob1));
		System.out.println();
				
		
		System.out.println(ob+ob1);
		System.out.println();
		System.out.println(ob2+ob3);
		System.out.println();
		System.out.println(ob2+ob3+ob+ob1);
		System.out.println();
		System.out.println(ob+ob1+ob2+ob3);
		System.out.println(ob+ob3+ob1);
		System.out.println(ob+ob1+(ob2+ob3));
		
		
		StringBuffer sb=new StringBuffer("Selinium");
		
		System.out.println(sb.reverse());
		
		
	}

}
