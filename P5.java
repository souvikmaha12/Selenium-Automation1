package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
public class P5 {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("newTabBtn")).click();
	Set<String>windows=driver.getWindowHandles();
	for(String data:windows) {
		String url=driver.switchTo().window(data).getTitle();
		System.out.println(url);
		if(url.equals("AlertsDemo - H Y R Tutorials")) {
			driver.close();
		}
	}
}
}
