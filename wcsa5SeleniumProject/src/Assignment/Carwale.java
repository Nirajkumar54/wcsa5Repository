package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Carwale {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.carwale.com/?utm_source=google&utm_medium=cpc&utm_campaign=11563520562&utm_term=carwale&gclid=Cj0KCQjwjryjBhD0ARIsAMLvnF_bz8eSz6OA8W8bFNNljHpIaUa3HAzu9PKzwlAl5BML79U4W-2GMtkaAtqbEALw_wcB");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Type to select car name, e.g. Renault Kiger']")).sendKeys("Mahindra Thar");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='o-fcaNGp o-dsiSgT o-NBTwp o-bVSleT o-cWRslo o-cRLvC o-eqqVmt o-eKWNKE   o-ItVGT o-bIMsfE  o-bkmzIL o-fdTMrI ORe58e o-cXuWIw o-casNrQ o-cDXfkV o-pAUxP o-pAUNF o-bdcqUi']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[text()='City']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@title='Pune']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Wakad - Pune, 411057']")).click();
			Thread.sleep(2000);
		}
}
