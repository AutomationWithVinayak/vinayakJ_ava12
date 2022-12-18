package casting;

public class ExplicitCasting {
	
	public static void main(String[] args) {
		
		int a=200;
		System.out.println(a);
		
		byte b=(byte) a;            //convrting higher data type into lower data type is called expliciti casting
		System.out.println(b);      // it iis also called as narrowing casting wherec memory size goes decresing
		                            //In explicit casting data loos take place
		double f= 98.97;
		int ff=(int) f;
		
		System.out.println(ff);
	}

}
