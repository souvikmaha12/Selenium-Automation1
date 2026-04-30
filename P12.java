package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
public class P12 {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://webapps.tekstac.com/OnlineShopping/");
	driver.manage().window().maximize();
	WebElement source=driver.findElement(By.id("carrot"));
	WebElement dest=driver.findElement(By.id("droppable"));
	//Actions act=new Actions(driver);
	//act.dragAndDrop(source, dest).perform();
	Actions act=new Actions(driver);
	Action act1=act.dragAndDrop(source, dest).build();
	act1.perform();
	WebElement slider=driver.findElement(By.id("myRange"));
	System.out.println(slider.getLocation());
	act.dragAndDropBy(slider, -50,0).perform();
	System.out.println(slider.getLocation());
}
}
