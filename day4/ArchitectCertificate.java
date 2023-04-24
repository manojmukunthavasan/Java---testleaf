package week4.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ArchitectCertificate extends BaseClass {
    
	
@Test(invocationCount=1,threadPoolSize=2)

	public void runArchitectCertificate() throws InterruptedException {
		
	
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
		driver.findElement(By.xpath("(//img[@class='roleMenu-item_img'])[2]")).click();
		String text = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--center Lh(1.5) ')]")).getText();
		System.out.println("Summary :"+text);
		
		System.out.println("*******************************************");
		
		List<WebElement> courses = driver.findElements(By.xpath("(//div[@class='credentials-card_title']//a)"));
		int count = courses.size();
		System.out.println("Architect Certification");
		
		System.out.println("*******************************************");
		
     for (int i = 1; i <=count; i++) {
			
			String Architects=driver.findElement(By.xpath("(//div[@class='credentials-card_title']//a)["+i+"]")).getText();
			System.out.println(Architects);
     }
		System.out.println("*******************************************");
		
		driver.findElement(By.linkText("Application Architect")).click();
		Thread.sleep(2000);
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='credentials-card_title']//a"));
		int count1 = findElements.size();
		System.out.println("Application Architect Certificates ");
		
		System.out.println("*******************************************");
		for (int j = 1; j <=count1 ; j++) {

			String AppArchitects=driver.findElement(By.xpath("(//div[@class='credentials-card_title']//a)["+j+"]")).getText();
			System.out.println(AppArchitects);
		}
		driver.quit();
	}

}
