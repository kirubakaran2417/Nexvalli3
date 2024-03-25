package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilereader {

	public static String getPropertyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Workspaces\\Nexvali3\\SeleniumDemos\\src\\test\\java\\resources\\configuration.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	
	}
	public static void main(String[] args) throws IOException {
		System.out.println(getPropertyValue("browserName"));
		
	}
}
