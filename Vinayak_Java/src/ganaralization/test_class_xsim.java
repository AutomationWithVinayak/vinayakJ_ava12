package ganaralization;

public class test_class_xsim {
	
	public static void main(String[] args) {
		
		Xairtel a=new Xairtel();
		a.sms();
		a.internet();
		a.airtelseva();
		
		System.out.println();
		
		Xbsnl b=new Xbsnl();
		b.sms();
		b.internet();
		b.bsnlseva();
		System.out.println();
		
		System.out.println();
		
		Xjio j=new Xjio();
		j.sms();
		j.internet();
		j.ambaniseva();
		
		
		
		
	}

}
