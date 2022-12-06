package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPPT {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./TestData/data.properties");
	Properties property=new Properties();
	property.load(fis);
	System.out.println(property.getProperty("url"));
	System.out.println(property.getProperty("un"));
	System.out.println(property.getProperty("pwd"));
}
}
