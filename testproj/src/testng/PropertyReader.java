package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	String Text="";

	
	/**
	 * 
	 * @Property
	 */
	public static String readProperty(String key) {

		String returnText = "";
		try {
			
			File file = new File("C:\\Users\\conevo\\eclipse-workspace\\testproj\\config.properties");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			returnText = properties.getProperty(key);
			fileInput.close();
		} catch (Exception e) {
		}
		return returnText;
	}
	
	public static String forenaame_1 = readProperty("username");
	public static String surname_1 = readProperty("password");
	
	
public static void main(String[] args) throws IOException {
			try {
				System.out.println(forenaame_1); 
				System.out.println(surname_1);
			}catch (Exception e){
				
			}
			}
}
