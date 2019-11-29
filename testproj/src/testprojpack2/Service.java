package testprojpack2;

public class Service extends Bmw{

	public void car () {
		
		
		
		System.out.println("this is overriding method");

	}
	
	public static void main(String args[]) {
		Bmw bmw = new Bmw();
		bmw.car();
		Audi audi = new Audi();
		audi.car();
		Bmw bm = new Service();
		bm.car();
	}
	
	

}
