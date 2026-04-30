package InterimPractise;
import java.util.*;
import java.io.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.*;
import org.openqa.*;
public class P11 {
public static void main(String args[])throws IOException,InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.get("https://webapps.tekstac.com/SeleniumApp1/EventManagement/index.html#tm-section-4");
	driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String dest=System.getProperty("user.dir")+"/screenshots/"+"WebPages"+".png";
	File file=new File(dest);
	FileHandler.copy(source, file);
	}
}
