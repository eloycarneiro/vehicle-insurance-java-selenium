package tests;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PreencheFormulario {
	private WebDriver driver;
	 
	 @Before
	 public void before() {
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Eloy_\\eclipse-workspace\\treinamento\\chromedriver.exe");
		driver = new ChromeDriver(chromeOptions);
	 }
	 
	 @Test
	 public void loginComSucesso() {
	   HomePage homePage = new HomePage(driver);
	   String url = "http://sampleapp.tricentis.com/";
	   
	   
	   FormPage principal = homePage.visita(url).inicia();
	   principal.preenche();
	   principal.preenche2aba();
	   principal.preenche3aba();
	   principal.preenche4aba();
	   principal.preenche5aba();
	   Assert.assertEquals(url, driver.getCurrentUrl().substring(0, 31));
	   
	   //Assert.assertTrue(principal.isValida());
	   
	   JOptionPane.showMessageDialog(null, "Sending e-mail success!");

	 }
	 
	 @After
	 public void after() throws InterruptedException {
		 Thread.sleep(100000);
	   driver.quit();
	 }
}
