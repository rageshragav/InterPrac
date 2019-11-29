package testproj3;

public class child1 extends parent{
public void test() {
	System.out.println("In child class");
}
public void run() {
	System.out.println("This is run method child1");
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
parent pt = new parent();
pt.test();
pt.run();

child1 ch1 = new child1();
ch1.test();


//
parent ch2 = new child1();
ch2.test();
ch2.run();


}

}
