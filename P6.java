package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
public class P6 {
public static void main(String args[]) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("newTabBtn")).click();
	Set<String>windows=driver.getWindowHandles();
	List<String>data=new ArrayList(windows);
	String parent=data.get(0);
	String child=data.get(1);
	driver.switchTo().window(child);
	driver.findElement(By.id("alertBox")).click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	Thread.sleep(2000);
	alert.accept();
	driver.findElement(By.id("confirmBox")).click();
	Alert alert1=driver.switchTo().alert();
	System.out.println(alert1.getText());
	Thread.sleep(2000);
	alert.dismiss();
	driver.findElement(By.id("promptBox")).click();
	Alert alert2=driver.switchTo().alert();
	System.out.println(alert2.getText());
	alert2.sendKeys("I am souvik");
	Thread.sleep(3000);
	alert.accept();
}
}
