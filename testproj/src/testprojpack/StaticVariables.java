package testprojpack;


class Emp { 

// static variable salary 
public static double salary; 
public static String name = "Harsh"; 
} 

public class StaticVariables 
{ 
	public static void main(String args[]) { 
		
	//class name with variable name		 
	Emp.salary = 1000; 
	System.out.println(Emp.name + "'s average salary:" + Emp.salary); 
} 
	
} 

