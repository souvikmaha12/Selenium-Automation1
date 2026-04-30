package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
public class P16 {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://webapps.tekstac.com/Registration/");
	driver.manage().window().maximize();
	WebElement date=driver.findElement(By.id("dob"));
	Actions act=new Actions(driver);
	act.click(date).sendKeys("2024-07-01").build().perform();
}
}
