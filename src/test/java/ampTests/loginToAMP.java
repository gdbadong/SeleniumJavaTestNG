package ampTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testUtils.common;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.support.ui.WebDriverWait;



public class loginToAMP {

	WebDriver driver = null;
	WebDriverWait wait = null;

	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://stg-am-premier.projamp.com/dashboard/");
		driver.manage().window().maximize();

	}

	@Test
	public void login() {
//		common.login(driver, "glenn.badong@outliant.com", "Lolzka24!");
		System.out.println(driver.getWindowHandle());
		common.getHttpResponse200(driver);
	}

	@AfterTest
	public void TearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test has successfully finished!");
	}
}
