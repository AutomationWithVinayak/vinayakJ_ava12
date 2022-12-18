package Array;

import java.util.Arrays;

public class Array3 {
	
	public static void main(String[] args) {
		
	
	
	int arr []=new int[5];
	
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=5;
	arr[4]=4;
	
	System.out.println(arr.length);
	System.out.println();
	Arrays.sort(arr);
	
	for(int i=0; i<5;i++) {
		
		System.out.println(arr[i]);
	}
	
	for(int a:arr) {
		System.out.println(a);
	}

	
	


}
}
