package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNG_SalesForceCreateNewOpportunity {
	@Test
	public void testNG_SalesForce1( ) throws InterruptedException {

ChromeOptions apt=new ChromeOptions();
apt.addArguments("--disable-notifications--");
ChromeDriver driver  = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://login.salesforce.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
driver.findElement(By.id("password")).sendKeys("Leaf@123");
driver.findElement(By.id("Login")).click();
//2. Click on toggle menu button from the left corner
driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
Thread.sleep(2000);
//3. Click view All and click Sales from App Launcher
driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
driver.findElement(By.xpath("//p[text()='Sales']")).click();
Thread.sleep(3000);
//4. Click on Opportunity tab 
WebElement findElement = driver.findElement(By.xpath("//span[text()='Opportunities']"));
driver.executeScript("arguments[0].click()", findElement);
//5. Click on New button
driver.findElement(By.xpath("//div[text()= 'New']")).click();
//6. Enter Opportunity name as 'Salesforce Automation by Your Name,Get the text and Store it 
WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow']//input)[3]"));
findElement2.sendKeys("Salesforce Automation by Manoj");
findElement2.getText();
//7. Choose close date as Today
driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='19']")).click();
driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux slds-combobox__input-value')])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
Thread.sleep(2000);
//8. Select 'Stage' as Need Analysis
driver.findElement(By.xpath("//span[@Title='Needs Analysis']")).click();
//9. click Save and VerifyOppurtunity Name"
driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
String OppNameFinal = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
if(OppNameFinal.equals("Salesforce Automation by Manoj")) {
	System.out.println("Opportunity Name is verified and is the correct value");
}else {
	System.out.println("Opportunity Name is wrong, please check");
}
Thread.sleep(2000);
driver.close();




	}

}
