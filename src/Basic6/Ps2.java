package Basic6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Ps2 {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw5dqgBhBNEiwA7PryaDlPAacUjpsvTyY7rmclvSV_YToVhit5iXC3Y5QpUU9UYC2qevhbzxoCUywQAvD_BwE");
		WebElement allcountry = driver.findElement(By.id("Form_getForm_Country"));
		Select s = new Select(allcountry);
		WebElement ele = s.getFirstSelectedOption();
		System.out.println(ele);
		
	}

}
