package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.TestRule;

public class FormPage extends ElementMap {

    private WebDriver driver;
    public FormPage(){
        this.driver = TestRule.getDriver();
        PageFactory.initElements(driver, this);
    }

    public boolean temFormularioPresente() {
        //CommonPage.waitVisibilityOf(idealsteps_wrap);
        Boolean existe = driver.findElements((By) idealsteps_wrap).size() > 0;
        return existe;
    }

}
