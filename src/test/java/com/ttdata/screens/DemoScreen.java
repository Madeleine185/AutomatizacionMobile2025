package com.ttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class DemoScreen extends PageObject{

    @AndroidFindBy(xpath = " //android.widget.ImageView[@content-desc=\"App logo and name\"]")
    private WebElement titulo;

    @AndroidFindBy(xpath= "//android.widget.FrameLayout[@content-desc=\"Container for fragments\"]/android.view.ViewGroup")
    private WebElement products;

    @AndroidFindBy(accessibility = "Sauce Labs Backpack ")
    private WebElement product1 ;

    @AndroidFindBy(accessibility = " Sauce Labs Bolt T-Shirt ")
    private WebElement  product2;

    @AndroidFindBy(accessibility = " Sauce Labs Bike Light ")
    private WebElement  product3;

    @AndroidFindBy(accessibility = " Increase item quantity ")
    private WebElement  agregarItem;




    public boolean tituloPagina(){

        return titulo.isDisplayed();
    }


    public boolean cargaProductos(){

        return products.isDisplayed();
    }

    public void clickImagen(){
        product1.click();
    }

    public void clickImagen(){
        agregarItem.click();
    }





}
