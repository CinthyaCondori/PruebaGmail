package com.accenture.gmail.steps;

import com.accenture.gmail.pages.Drive;
import com.accenture.gmail.pages.GoogleDrive;
import com.accenture.gmail.pages.IniciarSesion;
import com.accenture.gmail.pages.Inicio;

import net.thucydides.core.annotations.Step;

public class StepsGmail {
	
	Inicio PageInicio;
	GoogleDrive PageGoogleDrive;
	IniciarSesion PageIniciarSesion;
	Drive PageDrive;
	
	//poner todos step
	@Step
	public void is_the_home_page() {
		PageInicio.open();
	}
	
	@Step
	public void BusquedaG() {
		PageInicio.InicioGmail();
	}
	
	@Step
	public void IrGoogleDrive() {
		PageGoogleDrive.SeleccionarGoogleDrive();
	}
	
	@Step
	public void IniciaSesion(String Email, String Contraseña) throws InterruptedException {
		PageIniciarSesion.IngresarSesion(Email, Contraseña);
	}
	
	@Step
	public void CreaDocumento(String Documento) {
		PageDrive.CrearDocumento(Documento);
	}
	
	
}
