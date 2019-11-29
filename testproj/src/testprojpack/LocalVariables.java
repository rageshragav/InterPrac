package testprojpack;
public class LocalVariables 
{ 
	public void TodayDay( int date) 
	{ //local variable age 
		String day = "Friday"; 
		System.out.println("The day is " + day + " and date is "+ date); 
	} 

	public static void main(String args[]) 
	{ 
		LocalVariables lv = new LocalVariables();
				lv.TodayDay(06); 
				//date=5;
				//obj.date=5;
				
	} 
	
} 

