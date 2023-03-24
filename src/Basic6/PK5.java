package Basic6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class PK5 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//WebElement allMonth = driver.findElement(By.id("Year"));
		//Select s =new Select(allMonth);
		
		WebElement allcountry = driver.findElement(By.id("Form_getForm_Country"));
		Select s = new Select(allcountry);
		if(s.isMultiple()) {
			System.out.println("True:is a multi list");
		}
		else {
			System.out.println("False:is sigle list");
		}
		//s.selectByVisibleText("1998");

	}

}
