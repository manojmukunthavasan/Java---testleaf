package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Chennai");
		Thread.sleep(3000);
		
		driver.findElement(By.className("selected")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("(//td[@class='wd day'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		WebElement sleeper = driver.findElement(By.xpath("//label[text()='SLEEPER']"));
		driver.executeScript("arguments[0].click()", sleeper);
		Thread.sleep(3000);
		
		String text2 = driver.findElement(By.xpath("(//div[@class='clearfix bus-item-details'])[1]")).getText();
		System.out.println(text2);
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
	}

}
