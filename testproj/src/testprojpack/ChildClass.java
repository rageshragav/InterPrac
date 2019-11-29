package testprojpack;

public class ChildClass extends parentClass{
	
	//same variable name as used in parent class
	String name = "ragesh";
	
	public void getName() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	//same method name 
	public void getData() {
		super.getData();
		System.out.println("Im in child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass cc = new ChildClass();
		cc.getName();
		cc.getData();
		
	}
}
