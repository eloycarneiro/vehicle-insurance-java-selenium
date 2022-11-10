package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.TestRule;

public class VehicleDataPage extends VehicleDataElementMap {

    private WebDriver driver  = TestRule.getDriver();
    public VehicleDataPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean verificarFormulario() {
        return entervehicledata.getText().contains("Enter Vehicle Data");
    }

    public void preencheMarca(String marca) {
        CommonPage.waitVisibilityOf(make);
        Select select = new Select(make);
        select.selectByValue(marca);
    }

    public void preencheDesempenho(Integer int1) {
        engineperformance.sendKeys(int1.toString());
    }

    public void preencheDataManufatura(String string) {
        dateofmanufacture.sendKeys(string);
    }

    public void preencheNumeroAssentos(Integer numeroAssento) {
        Select select = new Select(numberofseats);
        select.selectByValue(numeroAssento.toString());
    }

    public void preencherTipoCombustível(String string) {
        Select select = new Select(fuel);
        select.selectByValue(string);
    }

    public void informarFaixaPreço(Integer int1) {
        listprice.sendKeys(int1.toString());
    }

    public void informarNumeroDoc(Integer int1) {
        licenseplatenumber.sendKeys(int1.toString());
    }

    public void informarMilhagemAnual(Integer int1) {
        annualmileage.sendKeys(int1.toString());
    }

    public void clicarProximaPagina() {
        nextenterinsurantdata.click();
    }
}
