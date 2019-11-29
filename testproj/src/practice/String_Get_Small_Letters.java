package practice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class String_Get_Small_Letters {

	public static void main(String[] args) {
		
		String text = "This IS My TEXT StrinG";
		//String text = "45))=:&TestG";
		String test = text.replaceAll("[^a-z]","");
		System.out.println("Output for Uppercase removed string" + test);
		
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println("Output for reverse string " + sb);
		String[] array = {"test","Abc1","test","Abc","Abc"};
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(Arrays.asList(array));
		String[] newArray = linkedHashSet.toArray(new String[linkedHashSet.size()]);
		System.out.println("Array after removing duplicates: " 
                + Arrays.toString(newArray));
		
	}
	public void remove_duplicate_Values_fromArray(){
		String[] array = {"test","Abc1","test","Abc","Abc"};
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>(Arrays.asList(array));
		String[] newArray = linkedHashSet.toArray(new String[linkedHashSet.size()]);
		System.out.println("Array after removing duplicates: " 
                + Arrays.toString(newArray));
		
	}
}
