package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowserWithClose {

	public static void main(String[] args) throws InterruptedException {
		//Relative path of Diver execcutable file
		System.setProperty("webdriver.chome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//Launch Chrome Browser
		
		//maximize the browser
		driver.manage().window().maximize();
		
		Thread.sleep(3000); //Stop for 3 sec * click on sleep and click on throw
		
		//to close Browser
		driver.close();

	}

}
