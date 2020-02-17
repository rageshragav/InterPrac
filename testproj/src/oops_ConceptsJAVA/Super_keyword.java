package oops_ConceptsJAVA;

public class Super_keyword {
	String color="white";  
	}  

	class Dog extends Super_keyword{  
	String color="black";  
	void printColor(){  
	System.out.println(color);//prints color of Dog class (Child class) 
	System.out.println(super.color);//prints color of Animal class  (Parent class)
	}  
	}  
	class TestSuper1{  
	public static void main(String args[]){  
	Dog d=new Dog();  
	d.printColor();  
	}
}
	
	//In this example we can access the parent class variables from child class using the super keyword if both the parent and 
	//child has same variable name
