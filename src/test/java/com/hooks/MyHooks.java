package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MyHooks {
	public WebDriver driver;
	
	@Before
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
	}
	@Before
	public void beforeScenario1(Scenario s) {
     System.out.println("Hooks1");
     String name = s.getName();
     System.out.println(name);

	}
	@After
	public void after1(Scenario s) {
	TakesScreenshot ts = (TakesScreenshot) driver;
	byte[] fbImage = ts.getScreenshotAs(OutputType.BYTES);
	s.embed(fbImage, "image/png");
	
	}	
}


