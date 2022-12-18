package final_;

 public class Final {
	 
	
	
	public static void main(String[] args) {
		
		
		
		int i=100;
		System.out.println(i);
		i=200;
		System.out.println(i);
		
		final int j=300;
		System.out.println(j);
		//j=400;                        ----The final local variable j cannot be assigned (restrication becs final )
		//System.out.println(j);
		
	}
	
	public final void  method() {                        //---------final method ------- doesnot override in subclass --only inherited
		System.out.println("Final method");
	}

}
