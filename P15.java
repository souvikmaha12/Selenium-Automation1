package InterimPractise;
import java.util.*;
import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit;
import java.io.*;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class P15 {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.get("https://webapps.tekstac.com/SeleniumApp1/SmartUniversity/login.html");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	WebElement ele=driver.findElement(By.id("register"));
	act.moveToElement(ele).build().perform();
	System.out.println(ele.getAttribute("title"));
	//act.contextClick().perform();
	act.contextClick(ele).perform();
}
}
