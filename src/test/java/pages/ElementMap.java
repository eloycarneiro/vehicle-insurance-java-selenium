package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementMap extends CommonPage{
    @FindBy(id = "nav_automobile")
    protected WebElement txtNavAutomobile;

    @FindBy(id = "selectedinsurance")
    protected WebElement txtSelectedInsurance;

//    @FindBy(name = "submit_search")
//    protected WebElement btnPesquisarProduto;

//    @FindBy(css = ".heading-counter")
//    protected WebElement lblQtdResultadosEncontrados;

//    @FindBy(id = "idealsteps-nav")
//    protected WebElement idealstepsnav;
}
