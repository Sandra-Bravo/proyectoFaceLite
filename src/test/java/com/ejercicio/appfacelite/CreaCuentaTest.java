package com.ejercicio.appfacelite;
import org.testng.annotations.Test;
import com.ejercicio.pages.CreaCuentaPage;

//import com.ejercicio.pages.SiguientePage;
public class CreaCuentaTest extends BaseTest {
	
	@Test
	public void inicio() {
		System.out.println("Escribe "+ getProperty("app_facelite"));
		System.out.println("Hola " + myDriver);
		CreaCuentaPage inicio=new CreaCuentaPage(myDriver);
     	inicio.crear();
     	inicio.captura();
     	inicio.sustituye();
     	inicio.coloca();
     	inicio.fecha();
     	inicio.genero();
     	inicio.contrasena();
	}
}
	