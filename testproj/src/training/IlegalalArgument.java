//package Exceptions;
package training;
public class IlegalalArgument {

	private static int getLength(String s) 
	{
		if(s==null)
			throw new IllegalArgumentException();
		return s.length();
	}

	
	public static void main(String args[])
	{
		 String s=null;
			try
			{
				System.out.println(getLength(s));
			}
		    catch(IllegalArgumentException e)
			{
		    	System.out.println("IllegalArgumentException caught");
			}
	}
}
