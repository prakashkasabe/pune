package Basic6;

import org.openqa.selenium.chrome.ChromeDriver;

public class text9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=16873177483496460482&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQjwk7ugBhDIARIsAGuvgPa1SgvB8qxILd-V2KmQ5FNoCYJWex1ADl3bZGBrOEgvCxV4k-Yn2rMaAiQ6EALw_wcB");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
	    String actualurl = driver.getCurrentUrl();
	    System.out.println(actualurl);
	    String actualpagesource = driver.getPageSource();
	    System.out.println(actualpagesource);
	    

	}

}
