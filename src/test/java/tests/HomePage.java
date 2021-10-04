package tests;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	 
	 public HomePage(WebDriver driver) {
	   this.driver = driver;
	 }
	 
	 public HomePage visita(String url) {
	   driver.get(url);
	   return this;
	 }
	 
	 public FormPage inicia() {
		 
		 WebDriverWait wait = new WebDriverWait(driver, 2000);
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("nav_automobile")));
		 
		 driver.findElement(By.id("nav_automobile")).click();
	   
		 
	 
		 return new FormPage(driver);
	 }
	 
}
