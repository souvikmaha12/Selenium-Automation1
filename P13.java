package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class P13 {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://webapps.tekstac.com/OnlineShopping/");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	WebElement source=driver.findElement(By.id("carrot"));
	WebElement dest=driver.findElement(By.id("droppable"));
	act.dragAndDrop(source, dest).perform();
	WebElement drop=driver.findElement(By.id("Platform"));
	Select sel=new Select(drop);
	List<WebElement>data=sel.getOptions();
	for(WebElement d:data) {
		System.out.println(d.getText());
	}
}
}
