package pages;

import org.openqa.selenium.support.PageFactory;

public class HomePage extends VehicleDataElementMap {

    public HomePage(){

        PageFactory.initElements(driver, this);
    }

    public void clickNav(){
        CommonPage.waitVisibilityOf(txtNavAutomobile);
        txtNavAutomobile.click();
    }
}
