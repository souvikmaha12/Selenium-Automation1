package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
public class P8 {
public static void main(String args[]) {
WebDriver driver=new ChromeDriver();
driver.get("https://webapps.tekstac.com/RentaCar/");
driver.manage().window().maximize();
//driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("souvik");
//driver.findElement(By.xpath("//input[contains(@id,'number')]")).sendKeys("9876543215");
//driver.findElement(By.xpath("//textarea[contains(@id,'address')]")).sendKeys("Agarpara");

//driver.findElement(By.xpath("//input[@type='text' and @id='name']")).sendKeys("Souvik");
//driver.findElement(By.xpath("//input[@type='tel' and @id='number']")).sendKeys("9876543212");

//driver.findElement(By.xpath("(//input)[2]")).sendKeys("9876543212");
//driver.findElement(By.xpath("(//input)[1]")).sendKeys("souvik");
//driver.findElement(By.xpath("(//input)[5]")).sendKeys("345672");

//driver.findElement(By.xpath("//button[text()='Confirm']")).click();
}
}