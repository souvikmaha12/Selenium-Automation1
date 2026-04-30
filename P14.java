package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class P14 {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://webapps.tekstac.com/SeleniumApp1/TrainReservation/login.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("gmailsignin")).click();
	String parent=driver.getWindowHandle();
	//System.out.println(driver.getTitle());
	Set<String>windows=driver.getWindowHandles();
	for(String data:windows) {
		/*if(!data.equals(parent)) {
			String child=data;
			driver.switchTo().window(child);*/
		System.out.println(data);
		String url=driver.switchTo().window(data).getTitle();
		System.out.println(url);
		}
	}
	//System.out.println(driver.getTitle());
	
}
