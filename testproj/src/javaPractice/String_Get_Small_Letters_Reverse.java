package javaPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class String_Get_Small_Letters_Reverse {

	
	
	
	public static void reverse(){
	String s = "ragesh";
	for(int i = s.length()-1;i>=0;i--){
		System.out.println(s.charAt(i));
	}
	}
	public static void main(String[] args) {
			
		String text = "This IS My TEXT StrinG";
		//String text = "45))=:&TestG";
		String test = text.replaceAll("[^a-z]","");
		System.out.println("Output for Uppercase removed string" + test);
		
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println("Output for reverse string " + sb);
		reverse();
	}
	
}
