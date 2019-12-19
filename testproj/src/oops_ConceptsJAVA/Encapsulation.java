package oops_ConceptsJAVA;

public class Encapsulation {

	 // Variables declared as private
    // These private variables can only be accessed by public methods of class
 int age;
 String name;

    // getter method to access private variable
public int getAge(){
	return age;
}

public String getName(){
	return name;
}

    // setter method to access private variable
public void setAge(int inputAge){
	age = inputAge;
}

public void setName(String inputName){
	name = inputName;
}
}
