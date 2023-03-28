
public class PCBuilderImpl implements PCBuilder {

	private PC pc;

	public PCBuilderImpl() {
		this.reset();
	}

	@Override
	public void reset() {
		this.pc = new PC();
	}

	@Override
	public void setSeats(int number) {
		this.pc.setSeats(number);
	}

	@Override
	public void setProcessor(String processor) {
		this.pc.setProcessor(processor);
	}

	@Override
	public void setMemory(String memory) {
		this.pc.setMemory(memory);
	}

	@Override
	public void setGraphicsCard(boolean graphicsCard) {
		this.pc.setGraphicsCard(graphicsCard);
	}

	public PC getResult() {
		PC result = this.pc;
		this.reset();
		return result;
	}
}