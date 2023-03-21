package button;

//declarando a classe windowsbutton  com a interface button 
public class WindowsButton implements Button {
	@Override
	//metodo paint, para que ela imprima mensagens na tela windows
	public void paint() {
		System.out.println("You have acreated WindowsButton");
	}
}
