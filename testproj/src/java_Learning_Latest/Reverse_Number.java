package java_Learning_Latest;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
int input = sc.nextInt();
int rev = 0;
while(input!=0) {
	
	rev = rev*10 + input%10;
	input=input/10;
}
System.out.println(rev);
if(rev == input) {
	System.out.println("Given number is palindrome");
}else {System.out.println("Given number is not palindrome");}
	}

}
