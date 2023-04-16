package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
      
      driver.switchTo().frame("iframeResult");
      driver.findElement(By.xpath("//button[text()='Try it']")).click();
      Alert al= driver.switchTo().alert();
      al.sendKeys("Manoj");
      al.accept();
      String text = driver.findElement(By.id("demo")).getText();
      
      System.out.println("text displaying is: "+text);
	}

}

