package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FormPage;
import pages.HomePage;

public class VehicleInsuranseFormSteps {

    @When("clicar para iniciar preenchimento de seguro")
    public void clickToRedirectToForm() {
        HomePage homePage = new HomePage();
        homePage.clickNav();
    }

    @Then("o formulário deverá aparecer na tela com sucesso")
    public void showForm() {
        FormPage formPage = new FormPage();
        //formPage.temFormularioPresente();



    }
}
