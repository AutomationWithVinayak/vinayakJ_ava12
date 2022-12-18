package Method_parameter;

public class ParaMethod {

	 public static void main(String[] args) {
		 StudantInfo("Vicky",10,'A',86.97f);
		 StudantInfo("Vinayak",20,'a',98.86f);
		 StudantInfo("Rahul",21,'a',90.55f);
		 StudantInfo("viki",26,'b',60.5f);
		 StudantInfo("snehal",25,'s',85.24f);
		 
		 
		 
		 
		  
		
	}
	 
	 public static void StudantInfo(String studantname,int rollno,char sgrade,float spercentage) {
		
		 System.out.println("Studant Name ="+studantname+","+"rollno ="+rollno+","+"Grade="+sgrade+","+"persentage ="+spercentage);
	 }
}
