package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameters {
WebDriver driver=null;
@Given("user opens the application")
public void user_opens_the_application() {
	String chromePath="C:\\Selenium Jars\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromePath);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    driver.manage().window().maximize();
    
}

@When("user clicks on sign in link")
public void user_clicks_on_sign_in_link() {
	driver.findElement(By.linkText("SignIn")).click();
}

@When("user enter {string} and {string} as a password")
public void user_enter_and_as_a_password(String username, String password) {
   driver.findElement(By.name("userName")).sendKeys(username);
   driver.findElement(By.name("password")).sendKeys(password);
   driver.findElement(By.name("Login")).click();
   driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
   driver.close();
}

@Then("message displayed login successful")
public void message_displayed_login_successful() {

   
}


}
