package Constructore;

public class need_of_con {
	
	String name;
	int  Rollno;
	
	
	public need_of_con(String name) {                       // public ntr -"classname"-(){ 
		System.out.println("defult contru.");
	
		
	}
	
	public static void main(String[] args) {
		need_of_con vk=new need_of_con("vk");
		vk.s1();
		vk.s2();
		
		
		
		
		
	}
	
	public void s1() {
		
	
		System.out.println(name+" "+Rollno);
		
	}
	public void s2() {
		
	
		System.out.println(name+" "+Rollno);
	}
	
}
