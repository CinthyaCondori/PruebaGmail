package com.accenture.gmail.steps.definitions;

import com.accenture.gmail.steps.StepsGmail;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepDefGmail {
		
	@Steps
	StepsGmail steps;
	
	@Given("^Que se quiere crear un documento$")
    public void que_se_quiere_crear_un_documento() throws Throwable {
        steps.is_the_home_page();
    }
	
    @When("^Se visualiza el buscador al iniciar$")
    public void se_visualiza_el_buscador_al_iniciar() throws Throwable {
    	steps.BusquedaG();
	}
    
    @And("^Se visualiza Google drive$")
    public void se_visualiza_google_drive() throws Throwable {
    	steps.IrGoogleDrive();
    }
    
    @And("^Se visualiza la pantalla de inicio sesion (.*) y (.*)$")
    public void se_visualiza_la_pantalla_de_inicio_sesion_y(String Email, String Contraseña) throws Throwable {
        steps.IniciaSesion(Email, Contraseña);
    }
    
    @Then("^Se visualiza la pantalla drive (.*)$")
    public void se_visualiza_la_pantalla_drive(String Documento) throws Throwable {
        steps.CreaDocumento(Documento);
    }

    
}
