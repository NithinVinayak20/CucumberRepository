package pageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingPageClass {
public static void main(String[] args) {
	String chromePath="C:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromePath);
	WebDriver driver=new ChromeDriver();
	PageClass PObject=new PageClass(driver);
	driver.get("http://demowebshop.tricentis.com/");
	PObject.clicklink();
	String username=null;
	PObject.typename(username);
	String password=null;
	PObject.typepassword(password);
	PObject.clickonloginlyn();
	
}
}
