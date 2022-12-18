package TypesOf_variable;

public class Globle_2 {
	
	
	static int i=30;
	
	
	
	public static void main(String[] args) {
		
		System.out.println(i);                        // i=30 ahe globle static class body madhe
		System.out.println();
		
		Globle_2 call=new Globle_2();
		call.m1();
		call.m2();                            /// non static method call by object creation
		call.m3();
		
		
		
	
	}
	public void m1() {
		
		i=40;
		                                        // last wali i chi value print hoil
		System.out.println(i);        // i=40 ahe yat method body made mhnun ha ithe 40 print karel
	}
	
	public void m2() {
		System.out.println(i);                 // i chi value last wali print karel
		
		
	}
     public void m3() {
    	 i=50;
    	 System.out.println(i);               // ithe ya method madhe i chi last value 50  ahe mhnun to 50 print karel 
     }

}
