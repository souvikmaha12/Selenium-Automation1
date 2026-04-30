package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.*;
//import org.apache.*;
import org.apache.commons.io.FileUtils;
public class P10 {
public static void main(String args[]) throws InterruptedException,IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://webapps.tekstac.com/RentaCar/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String dest=System.getProperty("user.dir")+"/screenshots/"+"Page"+".png";
	File fd=new File(dest);
	FileHandler.copy(source, fd);
}
}
