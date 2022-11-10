package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestRule;

import java.time.Duration;

public class CommonPage {

	//private String idNav = "nav_automobile";

	protected static WebDriver driver = TestRule.getDriver();

	protected static void waitVisibilityOf(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	protected static void moveToElement(WebElement element){
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	protected static void clickToElement(WebElement element){
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
	}


}
