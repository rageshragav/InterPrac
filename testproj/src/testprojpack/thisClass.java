package testprojpack;

public class thisClass {

	int a = 2;
	
	public void getNum() {
		int a = 3;
		
		//usage of this
		System.out.println(this.a);
		//
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisClass tc = new thisClass();
		tc.getNum();
	}

}
