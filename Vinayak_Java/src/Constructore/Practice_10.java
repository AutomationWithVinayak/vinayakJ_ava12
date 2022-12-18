 package Constructore;

public class Practice_10 {
	
	String name;
	int rollno;
	float percentage;
	char grade;
	
	Practice_10(String n,int r,float p,char g)  {
		name=n;
		rollno=r;
		percentage=p;
		grade=g;	
		
	}
	
	public void studant_info() {
		
		System.out.println("studant_name ="+name+","+"roll_no ="+rollno+","+"perccentage ="+percentage+","+"Grade ="+grade);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Studant_information");
		System.out.println();
		
		Practice_10 snehal=new Practice_10("vicky",26,98.37f,'A');
		
		
				snehal.studant_info();
	}
                                                                      //{Vicky...}
}
