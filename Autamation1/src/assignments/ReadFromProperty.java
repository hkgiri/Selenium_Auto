package assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperty {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(".\\data\\commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value = p.getProperty("url");
			System.out.println(value);
	}
}
