package tests;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage {
	private WebDriver driver;

	 
	 public FormPage(WebDriver driver) {
	   this.driver = driver;
	 }
	 
	 public boolean isValida() {
	   return temBarraNavegacao() && temListagemProjetos();
	 }
	 
	 private boolean temBarraNavegacao() {
	   return driver.findElement(By.className("bottom-header")) != null;
	 }
	 
	 private boolean temListagemProjetos() {
	   return driver.findElement(By.id("selectedinsurance")).getText().contains("Automobile Insurance");
	 }
	 
	 public FormPage preenche() {
		 
		 WebDriverWait wait = new WebDriverWait(driver, 2000);
		 
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("make")));
		   
		 Select selectMarca = new Select(driver.findElement(By.id("make")));
		 selectMarca.selectByValue("Porsche");
	   
		 driver.findElement(By.id("engineperformance")).sendKeys("2000");
		 driver.findElement(By.id("dateofmanufacture")).sendKeys("10/10/2000");
	   
		 Select numberAssentos = new Select(driver.findElement(By.id("numberofseats")));
		 numberAssentos.selectByValue("2");
	   
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fuel")));
	   
		 Select tipoCombustivel = new Select(driver.findElement(By.id("fuel")));
		 tipoCombustivel.selectByValue("Gas");
	   
		 driver.findElement(By.id("listprice")).sendKeys("100000");
		 driver.findElement(By.id("annualmileage")).sendKeys("20000");
		 driver.findElement(By.id("nextenterinsurantdata")).click();
		 
		 return new FormPage(driver);
	 }
	 
	 public FormPage preenche2aba() {
		 
		 driver.findElement(By.id("firstname")).sendKeys("Eloy");
		 driver.findElement(By.id("lastname")).sendKeys("Carneiro");
		 driver.findElement(By.id("birthdate")).sendKeys("10/10/2000");
	   
		 Select pais = new Select(driver.findElement(By.id("country")));
		 pais.selectByValue("Brazil");
	   
		 driver.findElement(By.id("zipcode")).sendKeys("52120120");
		 driver.findElement(By.id("city")).sendKeys("Recife");
	   
		 Select profissao = new Select(driver.findElement(By.id("occupation")));
		 profissao.selectByValue("Employee");
	   
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[5]/span")).click();
		 driver.findElement(By.id("nextenterproductdata")).click();
		 
		 return new FormPage(driver);
	 }
	 
	 public FormPage preenche3aba() {
		 driver.findElement(By.id("startdate")).sendKeys("11/11/2021");
		   
		 Select insurance  = new Select(driver.findElement(By.id("insurancesum")));
		 insurance.selectByValue("3000000");
	   
		 Select meritrating = new Select(driver.findElement(By.id("meritrating")));
		 meritrating.selectByValue("Bonus 1");
	   
		 Select damageinsurance = new Select(driver.findElement(By.id("damageinsurance")));
		 damageinsurance.selectByValue("Full Coverage");
	   
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span")).click();

		 Select courtesycar = new Select(driver.findElement(By.id("courtesycar")));
		 courtesycar.selectByValue("Yes");
		 
		 driver.findElement(By.id("nextselectpriceoption")).click();
		 
		 return new FormPage(driver);
	 }
	 
	 public FormPage preenche4aba() {
		 WebDriverWait wait = new WebDriverWait(driver, 2000);
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span")).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("nextsendquote")));
		 
		 driver.findElement(By.id("nextsendquote")).click();
		 
		 
		 return new FormPage(driver); 
	 }
	 
	 public FormPage preenche5aba() {
		 
		 WebDriverWait wait = new WebDriverWait(driver, 2000);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
		   
		 driver.findElement(By.id("email")).sendKeys("eloy.carneiro@gmail.com");
		 driver.findElement(By.id("username")).sendKeys("eloycarneiro");
		 driver.findElement(By.id("password")).sendKeys("IronMaiden666");
		 driver.findElement(By.id("confirmpassword")).sendKeys("IronMaiden666");
		 driver.findElement(By.id("sendemail")).click();
	   
		 JOptionPane.showMessageDialog(null, "Sending e-mail success!");
		 
		 return new FormPage(driver);
	 }
}
