package java_Learning_Latest;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr =  {1, 2, 3, 4, 5};  
		 String [] arr1 =  {"BB", "OO", "CC"};
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.println(arr[i]);  
	        }  
	        System.out.println(); 
	        for (int i = arr1.length-1; i >= 0; i--) {  
	            System.out.println(arr1[i]);  
	        } 
	}

}
