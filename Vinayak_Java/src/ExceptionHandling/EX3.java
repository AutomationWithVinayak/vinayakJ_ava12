package ExceptionHandling;

public class EX3 {

	public static void main(String[] args) {

		System.out.println("Program is started");

		int a=20;
		try {

			System.out.println(a/0); //This code will throw an exception
		}	

		catch(ArithmeticException e) { // Here we have to tell what kind of exception will throw

			e.printStackTrace();
			System.out.println(e.getMessage());

			System.out.println("This /by Zero ");
		}


		//if u don't know the exception name
		//generic Exception

		String s=null;
		try {

			System.out.println(s.length());

		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("h");
	}



}

