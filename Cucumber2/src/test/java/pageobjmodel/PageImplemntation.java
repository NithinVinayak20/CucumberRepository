package pageobjmodel;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageImplemntation {

@Test
public void call()
{
	String chromePath="C:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromePath);
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WithPageFactory locateElements=PageFactory.initElements(driver, WithPageFactory.class);
	locateElements.loginMethod("aravind.guggilla57@gmail.com", "aravind");

	}

}
