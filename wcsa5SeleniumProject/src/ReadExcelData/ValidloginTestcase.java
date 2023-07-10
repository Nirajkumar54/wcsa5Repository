package ReadExcelData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidloginTestcase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-vc52fbbs/login.do");
		
		//read the data form excel file and test the login page
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendkeys

	}

}
