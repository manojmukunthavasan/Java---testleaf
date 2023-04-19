package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement dr = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement dp = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(dr, dp).perform();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
