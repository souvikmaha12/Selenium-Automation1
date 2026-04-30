package InterimPractise;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
public class P2 {
	public static void main(String args[]) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://webapps.tekstac.com/SeleniumApp1/EventManagement/index.html#tm-section-4");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
List<WebElement>data=driver.findElements(By.tagName("a"));
System.out.println(data.size());
for(WebElement d:data) {
	System.out.println(d.getText());
	System.out.println("-"+d.getAttribute("href"));
}
driver.findElement(By.className("nav-link")).click();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();
}
}
