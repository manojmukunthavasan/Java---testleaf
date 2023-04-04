package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class HomeAssignment1 {


		public static void main(String[] args) throws InterruptedException {
			
			EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			
			
			driver.get("http://leaftaps.com/opentaps/control/login ");
	         driver.findElement(By.id("username")).sendKeys("DemoCsr");
	         driver.findElement(By.id("password")).sendKeys("crmsfa");
	         driver.findElement(By.className("decorativeSubmit")).click();
	         driver.findElement(By.linkText("CRM/SFA")).click();
	         driver.findElement(By.linkText("Leads")).click();
	         driver.findElement(By.linkText("Create Lead")).click();
	         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf.org");
	         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manoj");
	         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mukunthavasan");
	         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manojmukunthavasan@gmail.com");
	         driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9345367686");       
	         driver.findElement(By.name("submitButton")).click();
	}

}
