package ampTests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testUtils.common;
import testUtils.identifiers;

public class sites_ElementChecking {
	WebDriver driver = null;
	WebDriverWait wait = null;
	
	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		common.openWebsite(driver, "https://stg-am-premier.projamp.com/dashboard/sites");
		common.login(driver, "glenn.badong@outliant.com", "Lolzka24!");

		WebElement sitesTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Sites')]")));
		sitesTab.click();
	}
	
	@Test
	public void checkAllElements() {
//		WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
		WebElement sitesTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Sites')]")));
		assert sitesTab.isDisplayed();
		
		WebElement breadcrumb_houseIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div/div[@class='MuiStack-root css-1q8ab3t']/div[@class='MuiBox-root css-o4ewtx']/div[@class='MuiStack-root css-ok8vuj']/div[1]//*[name()='svg']")));
		assert breadcrumb_houseIcon.isDisplayed();
		
		WebElement breadcrumb_homeText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Home'][@href='/dashboard']")));
		assert breadcrumb_homeText.isDisplayed();
		
		WebElement breadcrumb_sitesText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sites'][@href='/dashboard/sites']")));
		assert breadcrumb_sitesText.isDisplayed();
		
		WebElement header_AllActiveSites = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),\"All Active Sites\")]")));
		assert header_AllActiveSites.isDisplayed();
		
		WebElement subheader_ListOfAllSites = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),\"List of all sites available in the Amazon Software\")]")));
		assert subheader_ListOfAllSites.isDisplayed();
		
		WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root css-ndyd5p\"]")));
		assert table.isDisplayed();
		
		WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Search\"][@class=\"MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedStart css-3swhcd\"]")));
		assert searchBar.isDisplayed();
		
		WebElement button_AddFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button//p[contains(text(),'Add Filter')]")));
		assert button_AddFilter.isDisplayed();
		
		WebElement button_ExportTable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Export Table')]")));
		assert button_ExportTable.isDisplayed();
		
		WebElement icon_Search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='path' and contains(@d,'M15.5 14h-')]")));
		assert icon_Search.isDisplayed();
		
		WebElement icon_AddFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='path' and contains(@d,'M19 13h-6v')]")));
		assert icon_AddFilter.isDisplayed();
		
		WebElement icon_ExportTable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='path' and contains(@d,'M19 12v7H5')]")));
		assert icon_ExportTable.isDisplayed();
		
		WebElement columnLabel_SiteID = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"css-k008qs\"]//div[contains(text(),\"Site ID\")]")));
		common.hoverOver(driver, columnLabel_SiteID);
		WebElement columnLabel_SiteID_Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div[2]/button")));
		assert columnLabel_SiteID.isDisplayed();
		assert columnLabel_SiteID_Button.isDisplayed();
		
		WebElement columnLabel_BusinessUnit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"css-k008qs\"]//div[contains(text(),\"Business Unit\")]")));
		common.hoverOver(driver, columnLabel_BusinessUnit);
		WebElement columnLabel_BusinessUnit_Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div[2]/button")));
		assert columnLabel_BusinessUnit.isDisplayed();
		assert columnLabel_BusinessUnit_Button.isDisplayed();
		
		WebElement columnLabel_OperationsType = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"css-k008qs\"]//div[contains(text(),\"Operations Type\")]")));
		common.hoverOver(driver, columnLabel_OperationsType);
		WebElement columnLabel_OperationsType_Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div[1]/div/div[2]/button")));
		assert columnLabel_OperationsType.isDisplayed();
		assert columnLabel_OperationsType_Button.isDisplayed();
		
		WebElement columnLabel_City = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"css-k008qs\"]//div[contains(text(),\"City\")]")));
		common.hoverOver(driver, columnLabel_City);
		WebElement columnLabel_City_Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div[1]/div/div[2]/button")));
		assert columnLabel_City.isDisplayed();
		assert columnLabel_City_Button.isDisplayed();
		
		WebElement columnLabel_State = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"css-k008qs\"]//div[contains(text(),\"State\")]")));
		common.hoverOver(driver, columnLabel_State);
		WebElement columnLabel_State_Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[5]/div[1]/div/div[2]/button")));
		assert columnLabel_State.isDisplayed();
		assert columnLabel_State_Button.isDisplayed();
		
		WebElement columnLabel_Country = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"css-k008qs\"]//div[contains(text(),\"Country\")]")));
		common.hoverOver(driver, columnLabel_Country);
		WebElement columnLabel_Country_Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div[1]/div/div[2]/button")));
		assert columnLabel_Country.isDisplayed();
		assert columnLabel_Country_Button.isDisplayed();
		
		WebElement text_RowPerPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Rows per page:\")]")));
		assert text_RowPerPage.isDisplayed();
		
		WebElement dropdown_itemCountPerPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\":r1a:\"]")));
		assert dropdown_itemCountPerPage.isDisplayed();
		
		WebElement text_pageRange = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class=\"MuiTablePagination-displayedRows css-y0kjlb\"]")));
		assert text_pageRange.isDisplayed();
		
		WebElement pageArrows = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"MuiTablePagination-actions\"]")));
		assert pageArrows.isDisplayed();
		
	}
	
	@Test
	public void testNumberOfItemsPerPage() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,2500)");

		WebElement dropdown_itemCountPerPage_25 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\":r1a:\"][contains(text(),\"25\")]")));
		dropdown_itemCountPerPage_25.click();

		WebElement dropdown_Option_25 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),\"25\")]")));
		WebElement dropdown_Option_50 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),\"50\")]")));
		WebElement dropdown_Option_100 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),\"100\")]")));
		assert dropdown_Option_25.isDisplayed();
		assert dropdown_Option_50.isDisplayed();
		assert dropdown_Option_100.isDisplayed();
		
		dropdown_Option_50.click();
		WebElement dropdown_itemCountPerPage_50 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\":r1a:\"][contains(text(),\"50\")]")));
		assert dropdown_itemCountPerPage_50.isDisplayed();
		dropdown_itemCountPerPage_50.click();

		dropdown_Option_100.click();
		WebElement dropdown_itemCountPerPage_100 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\":r1a:\"][contains(text(),\"100\")]")));
		assert dropdown_itemCountPerPage_100.isDisplayed();
		dropdown_itemCountPerPage_100.click();
		
		dropdown_Option_25.click();
		assert dropdown_itemCountPerPage_25.isDisplayed();
		dropdown_itemCountPerPage_25.click();
		
	}
	
//	@Test
//	public void test_Pagination() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("scrollBy(0,2500)");
//		
//		WebElement text_pageRange1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\'1–25 of\')]")));
//		assert text_pageRange1.isDisplayed();
//		
//		WebElement pageArrow_Right = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title=\"Go to next page\"]")));
//		pageArrow_Right.click();
//		
//		WebElement text_pageRange2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\'26–50 of\')]")));
//		assert text_pageRange2.isDisplayed();
//
//		pageArrow_Right.click();
//		WebElement text_pageRange3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\'51–75 of\')]")));
//		assert text_pageRange3.isDisplayed();
//		
//		WebElement pageArrow_Left = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title=\"Go to previous page\"]")));
//		pageArrow_Left.click();
//		pageArrow_Left.click();
//		assert text_pageRange1.isDisplayed();
//	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
