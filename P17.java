package InterimPractise;
import java.util.*;
import java.io.*;
public class P17 {
public static void main(String args[])throws IOException,FileNotFoundException {
	FileInputStream file=new FileInputStream("C:\\Users\\2484105\\eclipse-workspace\\SeleniumLearning\\conf.properties");
	Properties prop=new Properties();
	prop.load(file);
	System.out.println("Name:"+prop.getProperty("Name"));
	System.out.println("Roll:"+prop.getProperty("Roll"));	
}
}
