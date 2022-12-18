package final_;

public class FinalStatic {
	
	//bank(uninitilaized) variable can be static aslo wich can initialized into static block only 
	
	
	final	static	  int vari;
	
  static {

	vari=10;
	
	}

  public static void main(String[] args) {
	
	  System.out.println(vari);
}
}
