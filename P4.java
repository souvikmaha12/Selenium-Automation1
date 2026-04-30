package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class P4 {
public static void main(String args[]) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("newWindowBtn")).click();
	Set<String>windows=driver.getWindowHandles();
	List<String>data=new ArrayList(windows);
	String parent=data.get(0);
	String child=data.get(1);
	driver.switchTo().window(child);
	System.out.println(child);
	System.out.println("-"+driver.getCurrentUrl());
	
	driver.switchTo().window(parent);
	System.out.println(parent);
	System.out.println("-"+driver.getCurrentUrl());
}
}
