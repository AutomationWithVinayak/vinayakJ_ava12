package Array;

public class Largest_Steps {
	
	/* Algorithm
	STEP 1: START.
	STEP 2: INITIALIZE int arr[] = {25, 11, 7, 75, 56}
	STEP 3: max = arr[0]
	
	STEP 4: REPEAT STEP 5 for(i=0; i< arr.length; i++)
	
	
	STEP 5: if(arr[i]>max)
	 
	              max=arr[i];
	              
	              
	STEP 6: PRINT "Largest element in given array:"
	STEP 7: PRINT max.
	STEP 8: END. */
	
	
	
	
	 public static void main(String[] args) {  
		  
	        //Initialize array 
		 
		 int [] arr = new int [] {25, 11, 7, 75, 56,1000};  
	        
	        //Initialize max with first element of array.  
	        int max = arr[0]; 
	        
	        //Loop through the array  
	        for (int i = 0; i < arr.length; i++) { 
	        	
	        	
	            //Compare elements of array with max(variable)
	        	
	           if(arr[i] > max)  
	               max = arr[i];  
	           
	        }  
	        System.out.println("Largest element present in given array: " + max);  
	    }  

}
