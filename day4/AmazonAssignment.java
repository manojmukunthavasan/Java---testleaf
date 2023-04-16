package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']//span[(text()=' for boys')]")).click();
		String t = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(t);
		driver.findElement(By.xpath("//span[text() = 'Safari']/preceding-sibling::div//i")).click();
		driver.findElement(By.xpath("//span[text()='American Tourister']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//span[text()='Last 90 days']")).click();
		driver.findElement(By.xpath("//span[text()='Sort by:']/parent::span")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		System.out.println("Printing Bag1 details");
		System.out.println("---------------------");
		
		String text = driver.findElement(By.xpath("(//h2[contains(@class,'a-spacing-none')]//span)[1]")).getText();
		System.out.println(text);
		
		String text1 = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base'])[1]")).getText();
		System.out.println(text1);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	}

}
