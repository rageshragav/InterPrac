package training;

public class audi  {
	public void gear()
	{
		System.out.println("Gear working fine");
	}
	
	public void color()
	{
		System.out.println("audi color is Red");
	}
			
	public static void main(String[] args) {
	Bmw obj=new Bmw();//compile time polymorphism,static polymorphism, subclass methods,parent class methods called,but if the methodname same it willrun only the sub class
	obj.start();
	obj.stop();
	obj.fillfuel();
	//obj.gear();
	obj.waterwash();
	
	Methodoverriding_car ob=new Methodoverriding_car();
	ob.start();
	ob.stop();
	ob.fillfuel();
	//ob.waterwash();
	//Top casting
	Methodoverriding_car c1=new Bmw();
	c1.start();
	c1.stop();
	c1.fillfuel();//parent class methods called by dynamic polymorphism
	//c1.waterwash(); this will not allowed only overriding methods allowed by referred by an base class reference variable dynamic or runtime polymorphism
	//Downcasting
	//audi a1=(audi)new Bmw();//classcastexception//we can refer like this but eventhough it will create compilation error,we cant refer the baseclass by child class reference variable.
	}

}
