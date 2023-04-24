package week4.day4;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class AdminCertification extends BaseClass {
	
@Test(invocationCount=1,threadPoolSize=2)
			
	public  void runAdminCertification()  throws InterruptedException {

		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> confirm = new ArrayList<String>(handles);
		driver.switchTo().window(confirm.get(1));
		driver.findElement(By.xpath("(//div[@class='dialog']//button)[2]")).click();
		
		Shadow dd=new Shadow(driver);
		dd.setImplicitWait(20);
		dd.findElementByXPath("//span[text()='Learning']").click();
		WebElement click = dd.findElementByXPath("//span[text()='Learning on Trailhead']");
		
		Actions hover = new Actions(driver);
		hover.moveToElement(click).perform();
		WebElement click1 = driver.findElement(By.xpath("//a[text()='Salesforce Certification']"));
		hover.moveToElement(click1).perform();
		click1.click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Administrator")).click();
		List<WebElement> certificate = driver.findElements(By.xpath("(//div[@class='trailMix-card-body_title']//a)"));
		int count = certificate.size();
		Thread.sleep(2000);
		
		   for (int i = 0; i <= count; i++) {
			driver.findElement(By.xpath("(//div[@class='trailMix-card-body_title']//a)["+i+"]")).getText();
			System.out.println(certificate);
			 
		}
		
		
	}

}
