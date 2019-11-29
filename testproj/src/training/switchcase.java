package training;
public class switchcase {


	   public static void main(String args[]){
	   		   
	      char val = 'x';

	      switch(val)
	      {
	         case 'a' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'b' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'x':
	            System.out.println("Invalid User Name");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + val);
	   }
	   
	}