package Basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prakash1 {

	public static void main(String[] args) {
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins");
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		//driver.findElement(By.id("username")).clear();
		//driver.findElement(By.id("password")).clear();
		
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("Pune");


	}

}
