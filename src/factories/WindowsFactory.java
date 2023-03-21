package factories;

//import das interfaces
import button.Button;
import button.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;

//declarando as classes windowsfactory 
public class WindowsFactory implements GUIFactory{
	@Override
	//declarando metodo create button para windows button
	public Button createButton() {
		return new WindowsButton();
		 
	}@Override 
	//declarando metodo create button para windows checkbox
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}


