package Constructore;

public class bhothard {

	int num3;
	int num4;
	
	public bhothard(int c, int d) {
		num3=c;
		num4=d;
	}	
		public void div() {                 //n s m
			int divvalue=num3/num4;
			System.out.println(divvalue);
		}
		public static void main(String[] args) {
			
			bhothard Vn=new bhothard(50,2);
			Vn.div();                      //  call fron same class
			
			
			Bhothard_Diff_class diff=new Bhothard_Diff_class(10,30);
			diff.m2();
			diff.m3();                       // call from diff class
		}
		
	}
	

