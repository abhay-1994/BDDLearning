package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	WebDriver driver;
	
	@Given("Browser is open")
	public void browser_is_open() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Given("user is navigate to register page")
	public void user_is_navigate_to_register_page() {
	   driver.get("https://demowebshop.tricentis.com/");
	   driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
	   driver.findElement(By.id("gender-male")).click();
	   driver.findElement(By.id("FirstName")).sendKeys("UserTest2");
	   driver.findElement(By.id("LastName")).sendKeys("QA");
	   driver.findElement(By.id("Email")).sendKeys("usertest212qa@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("UserTest2");
	   driver.findElement(By.id("ConfirmPassword")).sendKeys("UserTest2");
	}

	@When("clicks on register button")
	public void clicks_on_register_button() {
	   driver.findElement(By.id("register-button")).click();
	}

	@Then("new account should be created")
	public void new_account_should_be_created() {
	    Assert.assertTrue(driver.findElement(By.xpath("//div[contains(.,'Your registration completed')]")).isDisplayed());
	}

	@Then("browser should be close")
	public void browser_should_be_close() {
		driver.quit();
	}

}
