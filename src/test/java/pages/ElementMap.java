package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ElementMap extends CommonPage{
    @FindBy(id = "nav_automobile")
    protected WebElement txtNavAutomobile;

    @FindBy(id = "selectedinsurance")
    protected WebElement txtSelectedInsurance;

    @FindBy(id = "entervehicledata")
    protected WebElement entervehicledata;

    @FindBy(id = "make")
    protected WebElement make;

    @FindBy(id = "engineperformance")
    protected WebElement engineperformance;

    @FindBy(id = "dateofmanufacture")
    protected WebElement dateofmanufacture;

    @FindBy(id = "numberofseats")
    protected WebElement numberofseats;

    @FindBy(id = "fuel")
    protected WebElement fuel;

    @FindBy(id = "listprice")
    protected WebElement listprice;

    @FindBy(id = "licenseplatenumber")
    protected WebElement licenseplatenumber;

    @FindBy(id = "annualmileage")
    protected WebElement annualmileage;

    @FindBy(id = "nextenterinsurantdata")
    protected WebElement nextenterinsurantdata;

//    @FindBy(name = "submit_search")
//    protected WebElement btnPesquisarProduto;

//    @FindBy(css = ".heading-counter")
//    protected WebElement lblQtdResultadosEncontrados;


}
