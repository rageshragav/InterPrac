package javaPractice;

import java.util.Arrays;
import java.util.Collections;

public class Array_sorting {

	
	
	
	public void sort_number(){
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};  
    	Arrays.sort(arr);   
    	System.out.printf("Modified arr[] : %s",Arrays.toString(arr));
    	
	}
	 public  void  sort_array(){
			// int Array
			Integer[] intArray = new Integer[] {
		    	new Integer(15),
		    	new Integer(9),
		    	new Integer(16),
		    	new Integer(2),
		    	new Integer(30)
			};

			// Sorting int Array in descending order
			//Arrays.sort(intArray, Collections.reverseOrder());
		 Arrays.sort(intArray);
			// Displaying elements of int Array
			System.out.println("Int Array Elements in reverse order:");
			for (int i = 0; i < intArray.length; i++)
		   	System.out.println(intArray[i]);
		 
			// String Array
			String[] stringArray =
		   	new String[] { "FF", "PP", "AA", "OO", "DD" };

			// Sorting String Array in descending order
			Arrays.sort(stringArray, Collections.reverseOrder());

			// Displaying elements of String Array
			System.out.println("String Array Elements in reverse order:");
			for (int i = 0; i < stringArray.length; i++)
		   	System.out.println(stringArray[i]);
		  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_sorting as = new Array_sorting();
		//as.sort_number();
		as.sort_array();
	}

}
