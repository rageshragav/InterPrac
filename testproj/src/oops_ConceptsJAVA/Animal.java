package oops_ConceptsJAVA;

public interface Animal {
	public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not have a body)
}

//First interface, this is inherited in the class Interface_lion
//Interface_lion object is in the class MyMainInterfaceClass

//Notes on Interfaces:
//Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainInterfaceClass)
//Interface methods do not have a body - the body is provided by the "implement" class
//On implementation of an interface, you must override all of its methods
//Interface methods are by default abstract and public
//Interface attributes are by default public, static and final
//An interface cannot contain a constructor (as it cannot be used to create objects)