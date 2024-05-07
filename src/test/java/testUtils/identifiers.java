package testUtils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class identifiers {
	WebDriver driver = null;
	WebDriverWait wait = null;
	
	public void sites() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
		WebElement sitesTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Sites')]")));
		WebElement breadcrumb_houseIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div/div[@class='MuiStack-root css-1q8ab3t']/div[@class='MuiBox-root css-o4ewtx']/div[@class='MuiStack-root css-ok8vuj']/div[1]//*[name()='svg']")));
		WebElement breadcrumb_homeText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Home'][@href='/dashboard']")));
		WebElement breadcrumb_sitesText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sites'][@href='/dashboard/sites']")));

		WebElement header_AllActiveSites = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),\"All Active Sites\")]")));

		WebElement subheader_ListOfAllSites = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),\"List of all sites available in the Amazon Software\")]")));

		WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-ndyd5p\"]")));

		WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=':r87:'][@placeholder=\"Search\"]")));
		WebElement button_AddFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button//p[contains(text(),'Add Filter')]")));
		WebElement button_ExportTable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Export Table')]")));
		WebElement icon_Search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='path' and contains(@d,'M15.5 14h-')]")));
		WebElement icon_AddFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='path' and contains(@d,'M19 13h-6v')]")));
		WebElement icon_ExportTable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='path' and contains(@d,'M19 12v7H5')]")));
//		WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
	
	
	
	
	}
}
