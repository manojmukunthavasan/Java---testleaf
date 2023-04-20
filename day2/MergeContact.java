package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import testcases.BaseClass;

public class MergeContact extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/control/login");
		// Username
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		// password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		// Click on First Resulting Contact
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allList.get(1));
		Thread.sleep(3000);
		//Click on Widget of From Contact
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(allList.get(0));
		Thread.sleep(3000);
		
		 //Click on Widget of To Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(3000);
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>allList2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(allList2.get(1));
		Thread.sleep(3000);
		
		 //Click on Second Resulting Contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]"));
		Thread.sleep(2000);
		driver.switchTo().window(allList2.get(0));
		
		//Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		
		// Accept the Alert
				Alert alt = driver.switchTo().alert();
				alt.accept();
				Thread.sleep(2000);
				// Verify the title of the page
				String title = driver.getTitle();
				if (title.contains("View Contact")) {
					System.out.println("Title page is Correct: " + title);
				} else {
					System.out.println("Page is Incorrect: " + title);
				}
				driver.close();
		
		
		
	}

}
