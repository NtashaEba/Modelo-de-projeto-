package app;

import factories.GUIFactory; //import interface GUIFactory
import factories.MacOSFactory; //import classes MacOSFactory
import factories.WindowsFactory; //import interface Windowsfactory

//Declarando classe demo
public class Demo {
	//declarando o metodo static para que ele retorne um objeto application 
	private static Application configureApplication() {
		//declarando as variaveis app do tipo application e a variavel factory do tipo GUIfactory
		Application app;
		GUIFactory factory;
		//declarando a variavel os.name 
		String osName = System.getProperty("os.name").toLowerCase();
		//se essa variavel receber a string mac ela ira receber uma nova instancia do objeto macosfactory
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
			//caso nao receba, ela ira coletar uma instancia do objeto windowsfactory
		} else {
			factory = new WindowsFactory();
		}
		app = new Application(factory);
		return app;
	}
	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}
}
