package practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class get_date_format {

	
	public static String getdate(){
		return  new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		
		
	}
	public static void testcasting(){
		double a = 5;
		double b = (double)a;
		
		System.out.println("int to float " + b);
		
	}
	public void get_tomdate(){
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();

		calendar.add(Calendar.DAY_OF_YEAR, 1);
		Date tomorrow = calendar.getTime();
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

		String todayAsString = dateFormat.format(today);
		String tomorrowAsString = dateFormat.format(tomorrow);

		System.out.println(todayAsString);
		System.out.println(tomorrowAsString);
		System.out.println("to test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getdate();
		System.out.println(getdate());
		testcasting();
	}

}
