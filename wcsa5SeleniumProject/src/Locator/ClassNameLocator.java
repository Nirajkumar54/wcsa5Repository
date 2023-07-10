package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("monica geller",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();

	}

}
