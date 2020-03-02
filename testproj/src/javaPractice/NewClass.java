package javaPractice;

import org.w3c.dom.CDATASection;

public class NewClass {
	
	public static void main(String[] args) {
		String input = "1a2b3c4defg&^$h567jkl";
       	
		double myDouble = 9.78;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);   
	    splitString();	
	    separateDigitsAndAlphabets(input);
	}
	public static void splitString() {
		/*String string = "004-034556";
		String[] parts = string.split("-");
		String part1 = parts[0]; // 004
		String part2 = parts[1]; // 034556
		System.out.println(part1);*/
		
	}
	public static void separateDigitsAndAlphabets(String str) {
       	String number = "";
       	String letter = "";
       	String special = "";
       	for (int i = 0; i < str.length(); i++) {
              	char a = str.charAt(i);
              	if (Character.isDigit(a)) {
                    	number = number + a;
              	} else if(Character.isAlphabetic(str.charAt(i))){
           		   letter=letter+a;
              	}             	 
              	else {
                    	special = special + a;
              	}
       	}
       	System.out.println("Alphates in string:"+letter);
       	System.out.println("Numbers in String:"+number);
       	System.out.println("Special in String:"+special);

	}

}
