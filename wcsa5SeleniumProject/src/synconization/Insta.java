package synconization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Insta {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("niraj.kumar_thora");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("niraj@5");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}
}
