package Interface;

public class B1_B2_complete implements b1,b2 {

	@Override
	public   void m3() {
		System.out.println("\"m3 method frm b2 but complete in implemantation class\"");
		
	}

	@Override
	public  void m4() {
		System.out.println("m4 method frm b2 but complete in implemantation class");
		
	}

	
	public  void m1() {
		System.out.println("\"m1 method frm b1 but complete in implemantation class\"");
		
	}

	@Override
	public  void m2() {
		System.out.println("\"m2 method frm b1 but complete in implemantation class\"");
	}

	
	
	
	
}