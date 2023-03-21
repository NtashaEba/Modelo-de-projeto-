package app;

import button.Button; //import interface button
import checkbox.Checkbox; //import interface checkbox
import factories.GUIFactory; //import interface GUIfactory

//declarando classe aplication 
public class Application {
	private button.Button button;
	//atributo private button TIPO button declarado
	private Checkbox checkbox;
	//atributo private checkbox TIPO checkbox declarado
	
	//declarando metodo construtor, tem como parametro a instancia factory da classe GUIFactory.
	public Application(GUIFactory factory) {
		button = factory.createButton();
		// Aqui foi atribuido ao atributo Button a instancia MacOSButton ou a windoesButton que retorna o metodo createButton().
		checkbox = factory.createCheckbox();
		// Aqui foi atribuido ao atributo checkbox a instancia MacOSCheckbox ou a windoescheckbox que retorna o metodo createButton().
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
		//Aqui o metodo Paint ira imprimir as imagens presentes no metodo Button.paint() e no metodo Checkbox.paint()
	}
}
