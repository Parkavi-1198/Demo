package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	WebDriver driver;

	@Given("Launch Facebook on login page")
	public void launch_facebook_on_login_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String user, String password) {
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("user click on login page")
	public void user_click_on_login_page() {
		driver.findElement(By.xpath("/*[@name='login']")).click();
	}

	@Then("user verify the error message")
	public void user_verify_the_error_message() {
		System.out.println("Done");
	}

	@When("User print Url of the page")
	public void user_print_url_of_the_page() {
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

	}

	@When("User print page title")
	public void user_print_page_title() {
		String title = driver.getTitle();
		System.out.println(title);

	}
}
