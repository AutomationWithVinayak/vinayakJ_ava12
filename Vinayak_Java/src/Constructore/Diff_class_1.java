package Constructore;

public class Diff_class_1 {
   
	int No;
	int No1;
	String name;
	
	
	
	
	
	public Diff_class_1() {                        //main - static --                   
		System.out.println("zero para..");
	}
	
	public Diff_class_1(int a, int b) {
		
		No=a;
		No1=b;
		
	}
	public Diff_class_1(String sname) {
		name=sname;
		
	}
	
	public void add() {
		int sum=No+No1;
		System.out.println(sum);
		
	}
	public void multi() {
		int cros=No*No1;
		System.out.println(cros);	
	}
	public void studaninfo() {
		
		System.out.println(name);
	}


		
		
	}
	

