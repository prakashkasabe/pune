package Basic6;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		//driver.get("https://www.actitime.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("window.confirm('Enter Your Name ')");
		
		//SCROLLING BY HORIZONTALLY
//		
//		jse.executeScript("window.scrollBy(0,900)");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,-300)");
//		
//		// SCROLLING  Y VERTICALLY
//		jse.executeScript("window.scrollBy(500,0)");
//		Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(-300,0)");
//		
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		jse.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
		}

}
