package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ZomatoLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("Nirajkumar");
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("nirajthorat5445@gmail.com");
		
		
	}

}
