package com.ttdata.stepsdefinitions;

import com.ttdata.steps.DemoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class DemoStepdefs {


    @Steps
    DemoSteps demoSteps;


    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {

        demoSteps.validacionAcceso();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {

        demoSteps.products();
    }

    @When("agrego <UNIDADES> del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(String arg0) {
        demoSteps.carrito();
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {

    }
}


