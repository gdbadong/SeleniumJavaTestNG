package gdbPersonalTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class explicitWaitDemo {
	WebDriver driver = null;
	WebDriverWait wait = null;

	@BeforeTest
	public void setUpTest() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		driver = new ChromeDriver(chromeOptions);
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://stg-am-premier.projamp.com/dashboard/sites");
		driver.manage().window().maximize();
	}

	@Test
	public void login() {
		WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
		WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Log in')]")));
		usernameField.sendKeys("glenn.badong@outliant.com");
		passwordField.sendKeys("Lolzka24!");
		submitButton.click();
	}

	@AfterTest
	public void TearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test has successfully finished!");
	}
}