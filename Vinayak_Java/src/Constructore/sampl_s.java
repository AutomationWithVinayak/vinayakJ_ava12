package Constructore;

public class sampl_s {

	String name;
	  String model;
	  int price;
	  String engine;
	  
	  
	  sampl_s(String name1, String model1, int price1, String engine1) {
		  
		  name=name1;
		  model=model1;
		  price=price1;
		  engine=engine1;
	  }
	  
	  sampl_s(String name, String model, int price) {
		  
		  this.name=name;
		  this.model=model;
		  this.price=price;
		  
	  }
	  
	  public static void main(String[] args) {
		  sampl_s rrr=new sampl_s("tata","suzuki",500,"Manual");
		  
		  System.out.println(rrr.name+" "+rrr.model+" "+rrr.price+" "+rrr.engine);
		  
		  sampl_s kgf=new sampl_s("bajaj","220f",180);
		  
		  System.out.println(kgf.name+" "+kgf.model+" "+kgf.price);
		  
	}
	  
	  
	  
	  
	  
	  
	  
	
}
