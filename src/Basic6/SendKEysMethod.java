package Basic6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SendKEysMethod {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
	 WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		//WebElement button = driver.findElement(By.xpath("right click me"));
		Actions action = new Actions(driver);
		action.sendKeys(checkbox,Keys.ENTER);
		//action.doubleClick(button);
		action.perform();

	}

}
