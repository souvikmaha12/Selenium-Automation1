package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class P1 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	WebDriver driver=new ChromeDriver();
	driver.get("https://webapps.tekstac.com/RentaCar/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	WebElement name1=driver.findElement(By.id("name"));
	name1.sendKeys("Souvik");
	System.out.println(name1.getAttribute("value"));
	WebElement num=driver.findElement(By.id("number"));
	System.out.println("Enter number");
	String n=sc.nextLine();
	num.sendKeys(n);
	driver.findElement(By.id("address")).sendKeys("Agarpara");
	WebElement date=driver.findElement(By.id("traveldate"));
	date.sendKeys("25-05-2026");
	WebElement drop=driver.findElement(By.id("cartype"));
	drop.sendKeys("SVU");
	drop.click();
	Select sel=new Select(drop);
	List<WebElement>data=sel.getOptions();
	sel.selectByVisibleText("Premium");
	System.out.println(sel.getFirstSelectedOption().getText());
	for(WebElement data1:data) {
		System.out.println(data1.getText());
	}
	driver.findElement(By.id("duration")).sendKeys("15");
	driver.findElement(By.id("license")).sendKeys("WER567");
	List<WebElement>check=driver.findElements(By.name("payment"));
	//System.out.println(check.getAttribute("value"));
	for(WebElement d:check) {
		System.out.println(d.getAttribute("value"));
	}
	WebElement c1=driver.findElement(By.id("netbanking"));
	System.out.println(c1.isSelected());
	c1.click();
	System.out.println(c1.isSelected());
	WebElement c2=driver.findElement(By.id("driver"));
	System.out.println(c2.isSelected());
	c2.click();
	System.out.println(c2.isSelected());
	driver.findElement(By.id("submit")).click();
}
}
