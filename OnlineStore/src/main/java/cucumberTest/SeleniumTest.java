package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import config.Constants;

public class SeleniumTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(Constants.WebDriver_Name, Constants.WebDriver_Path);
		driver = new FirefoxDriver();
		String url = "http://www.store.demoqa.com";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='account']/a"));
		driver.findElement(By.id("log")).sendKeys(Constants.UserName);
		driver.findElement(By.id("pwd")).sendKeys(Constants.Passsword);
		driver.findElement(By.id("submit")).click();
		System.out.println("Login Successfully");
		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
		System.out.println("LogOut Successfully");
		driver.quit();
	}

}
