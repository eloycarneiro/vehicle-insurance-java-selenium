package pages;

import org.openqa.selenium.support.PageFactory;

public class HomePage extends ElementMap {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void clickNav(){
        txtNavAutomobile.click();
    }
}
