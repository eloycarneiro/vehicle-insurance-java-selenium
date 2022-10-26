package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestRule;

import java.time.Duration;

public class CommonPage {

	//private String idNav = "nav_automobile";

	protected WebDriver driver = TestRule.getDriver();

	protected static void waitVisibilityOf(WebElement element){
		WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	protected static void moveToElement(WebElement element){
		Actions action = new Actions(TestRule.getDriver());
		action.moveToElement(element).build().perform();
	}


}
