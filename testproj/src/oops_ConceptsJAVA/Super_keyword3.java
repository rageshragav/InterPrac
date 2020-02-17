package oops_ConceptsJAVA;

public class Super_keyword3 {  
	Super_keyword3(){
		System.out.println("animal is created");
		}  
	}  
	class skr extends Super_keyword3{  
	skr(){  
	super();  
	System.out.println("dog is created");  
	}  
	}  
	class TestSuper3{  
	public static void main(String args[]){  
	skr d=new skr();  
	}
}
	
	//In this example we can access the Super_keyword3() constructor in the child class by just using the super keyword 
//super is used to invoke parent class constructor.
	//This is a sample text