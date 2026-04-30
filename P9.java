package InterimPractise;
import java.util.*;
import java.io.*;
import org.apache.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class P9 {
public static void main(String args[])throws IOException,InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.get("https://webapps.tekstac.com/PurchaseApp/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String dest=System.getProperty("user.dir")+"/screenshots/"+"HomePage"+".png";
	File fd=new File(dest);
	FileHandler.copy(source, fd);
}
}
