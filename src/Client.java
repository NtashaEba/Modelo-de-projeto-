
public class Client {
	public static void main(String[] args) {
		PCBuilder pcBuilder = new PCBuilderImpl();
		PCManualBuilder pcManualBuilder = new PCManualBuilderImpl();
		PCDirector director = new PCDirector(pcBuilder);
		PCDirector manualDirector = new PCDirector(pcManualBuilder);
			director.constructGamingPC();
		    PC gamingPC = pcBuilder.getResult();
		    System.out.println("Gaming PC built:\n" + gamingPC);

		    manualDirector.constructHomePC();
		    PC homePC = pcBuilder.getResult();
		    System.out.println("Home PC built:\n" + homePC);
		    
		}
}