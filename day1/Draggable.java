package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://jqueryui.com/draggable/");
			driver.switchTo().frame(0);
			WebElement dr = driver.findElement(By.xpath("//p[text()='Drag me around']"));
		    
			Actions builder = new Actions(driver);
			builder.dragAndDropBy(dr, 250, 150).perform();
			 
			Thread.sleep(3000);
			driver.close();
		
		
	}

}
