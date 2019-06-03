package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepDef2 {
	WebDriver driver=null;
	@Given("user login page is openend")
	public void user_login_page_is_openend() {
		String chromePath="C:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enter {string} as a username and {string} as a password")
	public void user_enter_as_a_username_and_as_a_password(String string, String string2) {
    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("lalitha");
    driver.findElement(By.name("password")).sendKeys("password123");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("Login")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	 
	}

	@Then("will Finds a testmeapp homepage")
	public void will_Finds_a_testmeapp_homepage() {
	
	}

}
