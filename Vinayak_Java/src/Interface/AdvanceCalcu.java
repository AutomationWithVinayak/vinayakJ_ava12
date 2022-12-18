package Interface;

public class AdvanceCalcu implements Calculator,Casio  {

	@Override
	public void log() {
		System.out.println("Casio interface : log ");
		
		
	}

	@Override
	public void Tan() {
		System.out.println("Casio interface : Tan ");
	
		
	}

	@Override
	public void addition() {
		System.out.println("add method frm Calculator interface");
		
		
	}

	@Override
	public void substraction() {
		System.out.println("sub method frm Calculator interface");
		
		
	}

	@Override
	public void multiplication() {
		System.out.println("multi method frm Calculator interface");
	
		
	}
	
	public void cos () {
		System.out.println("from AdvanceCalcu class : cos");
	}
   public  void sin() {
	   System.out.println("from AdvanceCalcu class : sin");
   }
}
