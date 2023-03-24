package Basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class Prakash5 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.linkText("Forgot your password?")).sendKeys(Keys.ENTER);
		//driver.close();
		//driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);

		WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(ele.isSelected())
		{
			System.out.println("Check Box Is Selected");
		}
		else
		{
			System.out.println("Check Box Is Not Selected");
		}
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		if(ele.isSelected()) {
			System.out.println("Check Box Is Selected");
		}
		else
		{
			System.out.println("Check Box Is Not Selected");
		}
		driver.close();
		
	}

}
	