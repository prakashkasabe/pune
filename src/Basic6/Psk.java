package Basic6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Psk {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement allcountry = driver.findElement(By.id("Form_getForm_Country"));
		Select s = new Select(allcountry);
		List<WebElement> country = s.getOptions();
		//System.out.println(ele);
		
		for(WebElement all:country)
		{
			//System.out.println(all.getText());
			s.selectByVisibleText(all.getText());
		}

	}

}
