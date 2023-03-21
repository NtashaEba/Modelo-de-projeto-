package button;

//declarando a classe MacOSbutton com a interface button
public class MacOSButton implements Button{
	@Override
	//metodo paint, para que ela imprima mensagens na tela macos
	public void paint() {
		System.out.println("You have acreated MacOSButton");
	}
}
