package com.ttdata.steps;

import com.ttdata.screens.DemoScreen;
import org.junit.Assert;

public class DemoSteps {

    DemoScreen demoScreen;

    public void validacionAcceso() {

        Assert.assertTrue(demoScreen.tituloPagina());
    }


    public void products() {

        Assert.assertTrue(demoScreen.cargaProductos());
    }

    public void carrito() {

        Assert.assertTrue(demoScreen.clickImagen());
    }




}
