package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class P7 {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://webapps.tekstac.com/RentaCar/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("#name")).sendKeys("Souvik");
	driver.findElement(By.cssSelector("#number")).sendKeys("9876543214");
	driver.findElement(By.cssSelector("#address")).sendKeys("Agarpara");
	WebElement cab=driver.findElement(By.cssSelector("#cartype"));
	cab.click();
	Select select =new Select(cab);
	List<WebElement>data=select.getOptions();
	for(WebElement d:data) {
		System.out.println(d.getText());
	}
}
}
