package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Spicejetlogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new EdgeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9595555445");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-19sur4y r-qklmqi r-1phboty r-1wdu9aa r-ubezar r-16dba41 r-10paoce r-12rqra3 r-13qz1uu']")).sendKeys("Niraj");	
	    driver.findElement(By.xpath("//div[@data-testid='login-submit-btn']")).click();
	    driver.close();
	    

	}

}
