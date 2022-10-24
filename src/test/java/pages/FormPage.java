package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.TestRule;

public class FormPage extends ElementMap {

    private WebDriver driver;
    public FormPage(){
        this.driver = TestRule.getDriver();
        PageFactory.initElements(driver, this);
    }

}
