package oops_ConceptsJAVA;

public class Super_keyword2 {  
	void eat(){
		System.out.println("eating...");
		}  
	}  
	class Dog1 extends Super_keyword2{  
	void eat(){
		System.out.println("eating bread...");
		}  
	void bark(){
		System.out.println("barking...");
		}  
	void work(){  
	super.eat();  
	bark();  
	}  
	}  
	class TestSuper2{  
	public static void main(String args[]){  
	Dog1 d=new Dog1();  
	d.work();  
	}
}
	
	//In this example we can access the parent class method from child class using the super keyword if both the parent and 
	//child has same method name
//super can be used to invoke parent class method