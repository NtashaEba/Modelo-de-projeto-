package factories;

import button.Button; //import interface button 
import checkbox.Checkbox;//import interface checkbox

//declarando a interface GUIFactory 
public interface GUIFactory {
	Button createButton();
	//declarando o metodo createbutton 
	Checkbox createCheckbox(); 
	//declarando o metodo create checkbox
}
