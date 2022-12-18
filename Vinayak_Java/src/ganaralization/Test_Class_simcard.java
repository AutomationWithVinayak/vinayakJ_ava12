package ganaralization;

public class Test_Class_simcard {
	
	
	public static void main(String[] args) {
		
		Airtel a=new Airtel();
		a.SMS();
		a.AudioCalling();
		a.Internet();
		a.Hotstrar();
		
		System.out.println();
		
		
		Jio j=new Jio();
		j.SMS();
		j.AudioCalling();
		j.Internet();
		j.Amazone();
		
		System.out.println();
		
		BSNL b=new BSNL();
		b.SMS();
		b.AudioCalling();
		b.Internet();
		b.Netflix();
		
		
		
		
		
		
	}

}
