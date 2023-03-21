package checkbox;

//declarando a classe windowscheckbox 
public class WindowsCheckbox implements Checkbox{
	@Override
	//metodo paint sera responsavel por imprimir mensagens na tela windows
	public void paint() {
		System.out.println("You have acreated WindowsCheckbox.");
	}
}
