package Constructore;

public class Sample3 {
	
	String name;
	String model;
	int price;
	String engine;
	
	public Sample3(String name1, String model1, int price1, String engine1) {
		
		name=name1;
		model=model1;
		price=price1;
		engine=engine1;
		
	}
	
	public static void main(String[] args) {
		Sample3 virat=new Sample3("Tata" , "Swift", 6000 ,"Manual");
		System.out.println(virat.name+" "+virat.model+" "+virat.price+" "+virat.engine);
	
		Sample3 kohli=new Sample3("hero" , "Hf" , 100 , "manual");
		System.out.println(kohli.name+" "+kohli.model+" "+kohli.price+" "+kohli.engine);
		
			
		 
		
	}
	

}
