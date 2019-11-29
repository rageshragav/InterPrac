//package Exceptions;
package training;
public class TryCatch {

	/*public void start(){
	try{
		int a[]={12,31,855};
		System.out.println(a.length);
		a[50]=10;
		
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	
	}
	
	public static void main(String[] args) {
		TryCatch obj=new TryCatch();
		obj.start();*/
	

	public void start(){
		try{
			String s="gfhgf";
			System.out.println(s.length());
			
			
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		}
		
		public static void main(String[] args) {
			TryCatch obj=new TryCatch();
			obj.start();
		

}
	/*public void start(){
		try{
			String s=null;
if(s.equals("fdfg"))
{System.out.println("same");
}
   else{
	System.out.println("not same");
}
		}
		
		catch(NullPointerException  e)
		{
			System.out.println(e);
		}
		
		}
		
		public static void main(String[] args) {
			TryCatch obj=new TryCatch();
			obj.start();*/
		

}

		

