package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.VehicleDataPage;
import runner.Hooks;

import java.util.List;
import java.util.Map;

public class VehicleDataPageSteps {

    @When("clicar para iniciar preenchimento de seguro")
    public void clickToRedirectToForm() {
        HomePage homePage = new HomePage();
        homePage.clickNav();
    }

    @Then("o formulário deverá aparecer na tela com sucesso")
    public void showForm() {
        VehicleDataPage formPage = new VehicleDataPage();
        formPage.verificarFormulario();
    }

    @Then("informar marca selecionada {string}")
    public void informar_primeira_aba_de_dados_do_cliente(String marca) {
        VehicleDataPage formPage = new VehicleDataPage();
        formPage.preencheMarca(marca);

    }

    @When("informar desempenho do motor {int}")
    public void informar_desempenho_do_motor(Integer valor) {
        // Write code here that turns the phrase above into concrete actions
        VehicleDataPage formPage = new VehicleDataPage();
        formPage.preencheDesempenho(valor);
    }

    @When("informar data de manufatura {string}")
    public void informar_data_de_manufatura(String string) {
        // Write code here that turns the phrase above into concrete actions
        VehicleDataPage formPage = new VehicleDataPage();
        formPage.preencheDataManufatura(string);
    }

    @When("informar numero de assentos {int}")
    public void informar_numero_de_assentos(Integer int1) {
        VehicleDataPage formPage = new VehicleDataPage();
        formPage.preencheNumeroAssentos(int1);
    }

    @When("informar tipo de combustível {string}")
    public void informar_tipo_de_combustível(String string) {
        VehicleDataPage formPage = new VehicleDataPage();
        formPage.preencherTipoCombustível(string);
    }
    @When("informar faixa de preço {int}")
    public void informar_faixa_de_preço(Integer int1) {
        VehicleDataPage formPage = new VehicleDataPage();
        formPage.informarFaixaPreço(int1);
    }

    @When("informar numero do documento {int}")
    public void informar_numero_do_documento(Integer int1) {
        VehicleDataPage formPage = new VehicleDataPage();
        formPage.informarNumeroDoc(int1);
    }

    @When("informar milhagem anual {int}")
    public void informar_milhagem_anual(Integer int1) {
        VehicleDataPage formPage = new VehicleDataPage();
        formPage.informarMilhagemAnual(int1);
    }


//| Marca     | DesempenhoMotor | DataManufatura | NumeroAssentos | TipoCombustivel | FaixaPreco | NumeroDocumento | MilhagemAnual |
//  String marca, int desempenhoMotor, String dataManufatura, int numeroAssentos, String tipoCombustivel, int faixaPreco, int numeroDocumento, int annualMileage
    @When("informar dados do veículo")
    public void informar_dados_do_veículo(DataTable dt) {
        VehicleDataPage formPage = new VehicleDataPage();
        List<Map<String,String>> data = dt.asMaps(String.class,String.class);

        formPage.preencheMarca(data.get(0).get("Marca"));
        formPage.preencheDesempenho(Integer.valueOf(data.get(0).get("DesempenhoMotor")));
        formPage.preencheDataManufatura(data.get(0).get("DataManufatura"));
        formPage.preencheNumeroAssentos(Integer.valueOf(data.get(0).get("NumeroAssentos")));
        formPage.preencherTipoCombustível(data.get(0).get("TipoCombustivel"));
        formPage.informarFaixaPreço(Integer.valueOf(data.get(0).get("FaixaPreco")));
        formPage.informarNumeroDoc(Integer.valueOf(data.get(0).get("NumeroDocumento")));
        formPage.informarMilhagemAnual(Integer.valueOf(data.get(0).get("MilhagemAnual")));

    }

    @When("seguir para proxima etapa do formulario")
    public void seguir_para_proxima_etapa_do_formulario() {
        VehicleDataPage formPage = new VehicleDataPage();

        formPage.clicarProximaPagina();
    }
}
