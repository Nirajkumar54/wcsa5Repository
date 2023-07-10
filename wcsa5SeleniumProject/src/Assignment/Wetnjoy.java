package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Wetnjoy {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lonavala.wetnjoy.in");
	Thread.sleep(2000);
	
}
}
