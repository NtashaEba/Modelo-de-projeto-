package factories;

//import das interfaces 
import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

//declarando a classe macosfactory 
public class MacOSFactory implements GUIFactory{
	@Override
	//metodo createButton para macosbutton
	public Button createButton() {
		return new MacOSButton();
		
	}
	@Override 
	//metodo createButton para macoscheckbox
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}
