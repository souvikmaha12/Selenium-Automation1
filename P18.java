package InterimPractise;
import java.util.*;
import java.io.*;
import org.openqa.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class P18 {
public static void main(String args[]) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://webapps.tekstac.com/selenium/FlightReservation/index.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("departureCity")).sendKeys("Delhi");
}
}
