package Interface;

public class I1_I2_Implemantation implements I1,I2 {

	@Override
	public void m3() {
		System.out.println("method m3 from interface I2");
		
		
	}

	@Override
	public void m4() {
		System.out.println("method m4 from interface I2");
		
	}

	@Override
	public void m1() {
		System.out.println("method m1 from interface I1");
		
	}

	@Override
	public void m2() {
		System.out.println("method m2 from interface I1");
		
	}
	
	 public void m5() {
		 System.out.println("method from implemantation class");
	 }

}
