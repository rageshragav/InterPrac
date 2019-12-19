package oops_ConceptsJAVA;

public class RunEncapsulation {
public static void main(String [] args){
		
	Encapsulation obj = new Encapsulation();
                // Setting values of the variables
		obj.setName("Ragesh");
		obj.setAge(25);
		
		System.out.println("My name is "+ obj.getName());
		System.out.println("My age is "+ obj.getAge());
}
}
