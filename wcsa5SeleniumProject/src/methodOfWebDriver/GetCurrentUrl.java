package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);}
}
