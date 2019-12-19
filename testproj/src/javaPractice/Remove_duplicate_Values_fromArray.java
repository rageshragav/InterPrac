package javaPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Remove_duplicate_Values_fromArray {

	public static void main(String[] args) {
		
		String[] array = {"test","Abc1","test","Abc","Abc"};
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(Arrays.asList(array));
		String[] newArray = linkedHashSet.toArray(new String[linkedHashSet.size()]);
		System.out.println("Array after removing duplicates: " 
                + Arrays.toString(newArray));
	}

}
