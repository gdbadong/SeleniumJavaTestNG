package testUtils;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class common {
	public static void login(WebDriver driver, String username, String password) {
		WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		submitButton.click();
	}
	
	public static void getHttpResponse200(WebDriver driver) {
		// Create an HttpClient object
		HttpClient httpClient = HttpClients.createDefault();
	
		// Create an HttpGet object with the target URL
		HttpGet httpGet = new HttpGet(driver.getCurrentUrl());
	
		// Execute the GET request
		HttpResponse response = null;
		try {
			response = httpClient.execute(httpGet);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// Get the response code
		int statusCode = response.getStatusLine().getStatusCode();
	
		// Check if response code is 200
			if (statusCode == 200) {
				System.out.println("GET request successful for Sites! Response code: " + statusCode);
			System.out.println(driver.getCurrentUrl());
			} else {
				System.out.println("GET request failed for Sites! Response code: " + statusCode);
			System.out.println(driver.getCurrentUrl());
			}
//		assertEquals(statusCode, 200);
	}

	public static void openWebsite(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void hoverOver(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
}
