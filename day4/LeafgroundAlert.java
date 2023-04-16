package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	      
	    driver.manage().window().maximize();
	      
	    driver.get("https://leafground.com/dashboard.xhtml");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//*[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//*[@id=\"menuform:m_overlay\"]/a")).click();
		driver.findElement(By.xpath("(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-outlined'])[1]")).click();
		Alert alert_1= driver.switchTo().alert();
		alert_1.accept();
		
		
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]")).click();
		Alert alert_2 = driver.switchTo().alert();
		alert_2.accept();
		
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left']")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='ui-dialog-titlebar ui-widget-header ui-helper-clearfix ui-corner-top ui-draggable-handle']//a)[2]")).click();
		
        driver.findElement(By.xpath("(//span[contains(text(),'Show')])[5]")).click();
		Alert alert_3 = driver.switchTo().alert();
		alert_3.sendKeys("Manoj");
		alert_3.accept();
		
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-trash']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Yes']")).click();
        
        
       driver.findElement(By.xpath("(//button[contains(@class,'ui-button ui-widget')])[8]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon-closethick')])[3]")).click();
        
        
		
		
	}

}
