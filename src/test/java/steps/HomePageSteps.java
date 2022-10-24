package steps;

import io.cucumber.java.en.Given;
import utils.TestRule;

public class HomePageSteps {

    @Given("que visite a home page do app tricentis")
    public void que_visite_a_home_page_do_app_tricentis() {
        String url = "http://sampleapp.tricentis.com/";
        TestRule.abrirNavegador(url);
    }
}
