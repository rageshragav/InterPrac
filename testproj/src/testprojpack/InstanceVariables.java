package testprojpack;

class Marks 
{    
    //These variables are instance variables. 
    //These variables are in a class and are not inside any function 
    String lang; 
    int count; 
    
}
class InstanceVariables 
{ 
	 
    public static void main(String args[]) 
    {   //first object 
        Marks obj1 = new Marks(); 
        obj1.lang = "java"; 
        obj1.count = 5; 
        System.out.println("Favourite language is " + obj1.lang); 
        System.out.println("Available languages are "+obj1.count); 
    } 
} 
 
