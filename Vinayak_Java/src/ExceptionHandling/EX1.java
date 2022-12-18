package ExceptionHandling;

public class EX1 {

	
	public static void main(String[] args) {
		
		System.out.println("hello");
		
		// Unchecked Exception
		
//		int a=20;
//		System.out.println(a/0);                     //ArithmeticException
		
		System.out.println("hi");
		
//		String s=null;
//		System.out.println(s.length());              // java.lang.NullPointerException
		
//		String s1="ABCD";                           // java.lang.NumberFormatException
//		int i=Integer.parseInt(s1);
//		System.out.println(i);
		
		
		int arr[] = new int[5];
		arr[10]=100;
		
		System.out.println("by");                      //java.lang.ArrayIndexOutOfBoundsException
		
		
		
		
		
	}
}
