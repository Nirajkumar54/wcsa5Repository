package synconization;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigateflipkart {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_3SkBxJ']/span[text()='Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Login']")).click();
	}
}
