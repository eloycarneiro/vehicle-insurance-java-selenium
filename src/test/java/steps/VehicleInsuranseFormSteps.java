package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FormPage;
import pages.HomePage;

public class VehicleInsuranseFormSteps {

    @When("clicar para iniciar preenchimento de seguro")
    public void clicar_para_ser_redirecionado_para_a_pagina_de_formulario_para_contratacao_de_seguro_automobilistico() {
        HomePage homePage = new HomePage();
        homePage.clickNav();
    }

    @Then("o formulário deverá aparecer na tela com sucesso")
    public void o_formulario_devera_aparecer_na_tela_com_sucesso() {
        FormPage formPage = new FormPage();
//        formPage.temFormularioPresente();



    }
}
