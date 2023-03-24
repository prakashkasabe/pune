package Basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prakash7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(ele.isSelected())
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		Thread.sleep(2000);
		ele.click();
				if(ele.isSelected()) {
			System.out.print("True");
		}
		else
		{
			System.out.println("false");
		}

	}

}
