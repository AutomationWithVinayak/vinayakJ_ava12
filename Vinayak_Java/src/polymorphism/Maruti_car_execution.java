package polymorphism;

public class Maruti_car_execution {

	
public static void main(String[] args) {
		
		Maruti m=new Maruti();                       
		m.start();
		m.stop();
		m.refule();
		m.Theftsafty();
		System.out.println();
		
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refule();
		System.out.println();
		
		
		//top casting or up casting or dyanamic polymorphism
		
		Car c1=new Maruti();
		c1.start();
		c1.stop();
		c1.refule();
		System.out.println();
		
		/*down  casting 
		Maruti m1=new Car();    not support java
		m1.start();
		m1.stop();
		m1.refule();
		m1.Theftsafty(); */
		
		System.out.println();
		
		
	//	Static s1=new Static_Child();
	//	s1.m1();
	//	s1.m2();
		
		
	}
}
