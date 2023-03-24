package Basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
 
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/free-online-trial");
		driver.findElement(By.id("https://www.actitime.com/free-online-trial")).sendKeys("Prakash");
		driver.findElement(By.name("pwd"));
	}
}