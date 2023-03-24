package Basic6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Ps1 {

	public static void main(String[] args) {
	
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement allcountry = driver.findElement(By.id("Form_getForm_Country"));
		Select s = new Select(allcountry);
		for(char i='A';i<='Z';i++)
		{
		s.selectByIndex(i);
		//List<WebElement> month = s.getOptions();
		}

	}

}
