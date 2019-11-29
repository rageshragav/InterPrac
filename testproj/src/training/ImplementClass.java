//package Interface;
package training;
public class ImplementClass implements interfacetwo,Interfaceone {
	
	public void start() {
		System.out.println("car started");
		
	}

	public void stop() {
		System.out.println("car stopped");
	}

	@Override
	public void run() {
		System.out.println("car running");
		
	}

	@Override
	public void go() {
		System.out.println("car going");		
	}

	@Override
	public void show() {
		System.out.println("car show");
		
	}
	public static void main(String[] args) {
		ImplementClass obj=new ImplementClass();
		obj.start();
		obj.stop();
		obj.run();
		obj.show();
		obj.go();
	
}
}