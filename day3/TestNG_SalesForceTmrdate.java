package week4.day3;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNG_SalesForceTmrdate {


		@Test
		public void TestNG_SalesForce2() throws InterruptedException {


			ChromeOptions apt=new ChromeOptions();
			apt.addArguments("--disable-notifications--");
			ChromeDriver driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			driver.findElement(By.id("password")).sendKeys("Leaf@123");
			driver.findElement(By.id("Login")).click();
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[text()='View All']")).click();
			driver.findElement(By.xpath("//p[text()='Sales']")).click();
			WebElement findElement = driver.findElement(By.xpath("//span[text()='Opportunities']"));
			driver.executeScript("arguments[0].click()", findElement);
			
			driver.findElement(By.xpath("//div[text()='New']")).click();
			driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//span[text()='20']")).click();
			driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
			String text = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
			if(text.contains ("Review the following fields")){
				System.out.println("Error message has appeared: "+"\n"	+text);
		}else {
			System.out.println("Warning has not appeared");
		}
	     driver.close();
		}

	}


	


