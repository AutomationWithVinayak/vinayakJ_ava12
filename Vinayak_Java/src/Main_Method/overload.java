package Main_Method;

public class overload {
	
	public static void main(String[] args) {
		
		System.out.println("main metod String[] args");
	}
	public static void main(int [] args) {
		System.out.println("main method int [] args");
	}
	
	/* 1. Overloading of the main is possible but	 
	 *     jvm will always call String [] args arguments  main  method only
	 * 2. inheritance concepts applicable for main method hence while executing child class if
	 *    child class doesn't contain main method then parent class main method will be executed
	 * 3. Q._can we override the main method :- "NO" 
	 *  
	 */

}
