package com.ejercicio.pages;

import org.openqa.selenium.By;

import com.ejercicio.appfacelite.MyDriverFaceLite;


public class CreaCuentaPage extends BasePage {

	public CreaCuentaPage(MyDriverFaceLite driver) {
		super(driver);
	}
	    public final String crearCuenta = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup";
	    public final String siguiente = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup";
        public final String nombre = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[1]";
        public final String nombreDos ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[2]";
	    public final String next = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup";
	    public final String telefono = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView";
	    public final String nextDos = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup";
	    public final String email="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView";
	    public final String nextTres = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup";
	    public final String fecha = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[5]";
	    public final String uno= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup";
	    public final String siete="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[13]/android.view.ViewGroup";
	    public final String cero= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[17]/android.view.ViewGroup";
	    public final String seis= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[12]/android.view.ViewGroup";
	    public final String nueve="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[15]/android.view.ViewGroup";
	    public final String nextcuatro="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup";
	    public final String selSexo="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]";
	    public final String pass="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView";
	    public final String envia="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup";
	    
	    public void crear() {
	    	super.waitVisibility(By.xpath(crearCuenta));
        	super.continuar(getDriver().findElementByXPath(crearCuenta));
        	super.continuar(getDriver().findElementByXPath(siguiente));
        }
	    
	    public void captura() {
	    	super.waitVisibility(By.xpath(nombre));
	    	super.escribe(getDriver().findElementByXPath(nombre),getDriver().findElementByXPath(nombreDos));
	    	waitVisibility(By.xpath(next));
	    	continuar(getDriver().findElementByXPath(next));
	    }
	    
	    public void sustituye() {
	    	super.waitVisibility(By.xpath(telefono));
	    	super.remplaza(getDriver().findElementByXPath(telefono));
	    	waitVisibility(By.xpath(nextDos));
	    	continuar(getDriver().findElementByXPath(nextDos));
	    }
	    
	    public void coloca() {
	    	super.waitVisibility(By.xpath(email));
	    	super.correo(getDriver().findElementByXPath(email));
	    	waitVisibility(By.xpath(nextTres));
	    	continuar(getDriver().findElementByXPath(nextTres));
	    }
	    
	    public void fecha() {
	     super.waitVisibility(By.xpath(fecha));
	     super.continuar(getDriver().findElementByXPath(fecha));
	     continuar(getDriver().findElementByXPath(uno));
	     continuar(getDriver().findElementByXPath(siete));
	     continuar(getDriver().findElementByXPath(cero));
	     continuar(getDriver().findElementByXPath(seis));
	     continuar(getDriver().findElementByXPath(uno));
	     continuar(getDriver().findElementByXPath(nueve));
	     continuar(getDriver().findElementByXPath(nueve));
	     continuar(getDriver().findElementByXPath(cero));
	     continuar(getDriver().findElementByXPath(nextcuatro));
	    
	    }
	    
	    public void genero() {
	      super.waitVisibility(By.xpath(selSexo));
	      super.continuar(getDriver().findElementByXPath(selSexo));
	      
	    }
	    
	    public void contrasena() {
	    	super.waitVisibility(By.xpath(pass));
	    	super.password(getDriver().findElementByXPath(pass));
	    	continuar(getDriver().findElementByXPath(envia));
	    }
}
