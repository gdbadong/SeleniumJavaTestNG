package ampTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testUtils.common;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


public class getAllPagesResponse {

	WebDriver driver = null;
	WebDriverWait wait = null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		common.openWebsite(driver, "https://stg-am-premier.projamp.com/dashboard/sites");

	}

	@Test
	public void login() {
		common.login(driver, "glenn.badong@outliant.com", "Lolzka24!");
	}
	
	@Test
	public void overviewTab_CheckResponse200() {
		common.getHttpResponse200(driver);
	}

	@Test
	public void sitesTab_CheckResponse200() {
		WebElement sitesTab = driver.findElement(By.xpath("//div[contains(text(),'Sites')]"));
		sitesTab.click();

		common.getHttpResponse200(driver);
	}

	@Test
	public void projectsTab_CheckResponse200() {
		WebElement projectsTab = driver.findElement(By.xpath("//div[contains(text(),'Projects')]")); 
		projectsTab.click();

		common.getHttpResponse200(driver);
	}
	
	@Test
	public void templatesTab_CheckResponse200() {
		WebElement templatesTab = driver.findElement(By.xpath("//div[contains(text(),'Templates')]")); 
		templatesTab.click();

		common.getHttpResponse200(driver);
	}
	
	@Test
	public void reportsTab_CheckResponse200() {
		WebElement templatesTab = driver.findElement(By.xpath("//div[contains(text(),'Reports')]")); 
		templatesTab.click();

		common.getHttpResponse200(driver);
	}
	
	@Test
	public void settingsTab_CheckResponse200() {
		WebElement templatesTab = driver.findElement(By.xpath("//div[contains(text(),'Settings')]")); 
		templatesTab.click();

		common.getHttpResponse200(driver);
	}
	
	@Test
	public void feedbackTab_CheckResponse200() {
		WebElement feedbackTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item css-1xp8igg\"]/div[@class=\"MuiStack-root css-13hsu6l\"]/div[1]")));
		
//		WebElement feedbackTab = driver.findElement(By.xpath("//div[@class=\"MuiGrid-root MuiGrid-item css-1xp8igg\"]/div[@class=\"MuiStack-root css-13hsu6l\"]/div[1]"));
		feedbackTab.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentid = (String) it.next();
		String childid = (String) it.next();
		
		driver.switchTo().window(childid);
		common.getHttpResponse200(driver);
		driver.close();
		
		driver.switchTo().window(parentid);
	}

	@Test
	public void manualTab_CheckResponse200() {
		WebElement manualTab = driver.findElement(By.xpath("//div[contains(text(),'Manual')]")); 
		manualTab.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentid = (String) it.next();
		String childid = (String) it.next();
		
		driver.switchTo().window(childid);
		common.getHttpResponse200(driver);
		driver.close();
		
		driver.switchTo().window(parentid);
	}
	
	@AfterTest
	public void TearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test has successfully finished!");
	}
}
