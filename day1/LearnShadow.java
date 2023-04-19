package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class LearnShadow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
       ChromeOptions options = new ChromeOptions();
       options.addArguments("--disable notifications");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://www.salesforce.com/products/platform/products/mysalesforce/");
       
       Shadow sh = new Shadow(driver);
       Thread.sleep(3000);
       
       WebElement s = sh.findElementByXPath("//span[text()='Products']");
       s.click();
       Actions act = new Actions(driver);
       act.moveToElement(s).perform();
       
	}

}
