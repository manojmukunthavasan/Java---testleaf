package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://login.salesforce.com/ ");
         driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
         driver.findElement(By.id("password")).sendKeys("Leaf@123");
         driver.findElement(By.id("Login")).click();
         //WebElement password = driver.findElement.By.id("password");
         //password.sendKeys("Leaf@123")
         Thread.sleep(5000);
         driver.close();
		
		
	}

}
