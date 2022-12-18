package String;

public class Replace {
	public static void main(String[] args) {
		
		
		String a= "04/05-1994";   //(...)
		
		String vk =a.replace("/", "..");   // 04..05-1994
		
		System.out.println(vk.replace("-", "..")); //04..05..1994
		
		
		
	}

}
