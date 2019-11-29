package testprojpack;

public class ConstructorSample {
	String text = "This is the constructor";
	
	//default constructor
	public  ConstructorSample(){
		System.out.println(text);
	}

	//parameterized 
	public  ConstructorSample(int a,int b){
		System.out.println("This is parameterized one");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorSample cs = new ConstructorSample();
		
		//To run parameterized constructor
		ConstructorSample cs1 = new ConstructorSample(10,5);
	}
	

}
