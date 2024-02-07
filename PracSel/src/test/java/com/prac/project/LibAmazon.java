package com.prac.project;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LibAmazon {

	WebDriver driver = new EdgeDriver();
	
	public void openApp() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(POMRepo.URL);
	}
	
	public void searchiPhone() {	
		driver.findElement(POMRepo.prodTypeDrpdwn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(POMRepo.prodTypeElectronics).click();
		driver.findElement(POMRepo.srchBar).sendKeys(POMRepo.iphone);
		
		try {
			WebElement iphoneNth = driver.findElement(POMRepo.NthProd);
			String iphoneDetails = iphoneNth.getText();
			System.out.println("'Nth' product title: " +iphoneDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.findElement(POMRepo.srchBttn).click();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		String scroll_script = "window.scrollTo({ top: document.body.scrollHeight, "
								+ "behavior: 'smooth' })";
		js.executeScript(scroll_script);
	}
}