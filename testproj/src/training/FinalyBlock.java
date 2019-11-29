//package Exceptions;
package training;
public class FinalyBlock {

	public static void main(String[] args) {
		try{
			int data=50/0;
			
		}

		catch(Throwable e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("Rest of the code");
		}
	}

}
