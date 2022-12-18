package Constructore;

public class Overload {
	
	public Overload() {
		
		System.out.println("zero parameter");
	}
	public Overload(int a) {
		System.out.println("1 parameter");
	}
	public Overload(String name) {
		System.out.println("1 parameter");
		
	}
	
	public Overload(int a,String name) {
		System.out.println("2 parameter");
		
	}
	public Overload(int a, String name, double d) {
		
		System.out.println("3 parameter");
		
	}
	
	public static void main(String[] args) {
		
	}
	
	

}