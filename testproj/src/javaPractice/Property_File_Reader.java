package javaPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_File_Reader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File("./Configurations/config.property");
		FileInputStream fis = new FileInputStream(f);
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("myname"));
	
	}

}
