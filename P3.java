package InterimPractise;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class P3 {
public static void main(String args[]) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://webapps.tekstac.com/SeleniumApp2/CallTaxiService/Home.html");
	driver.manage().window().maximize();
	//System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getTitle());
	driver.findElement(By.partialLinkText("vices")).click();
	WebElement ele=driver.findElement(By.xpath("//*[text()='Type of Cab Services']"));
	System.out.println(ele.getText());
	Thread.sleep(3000);
	driver.navigate().back();
	driver.findElement(By.linkText("Booking")).click();
	WebElement ele1=driver.findElement(By.xpath("//*[text()='Booking Details']"));
	System.out.println(ele1.getText());
	Thread.sleep(3000);
	driver.navigate().back();
	
}
}
