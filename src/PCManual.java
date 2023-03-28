
public class PCManual {

	private int seats;
	private String processor;
	private String memory;
	private boolean graphicsCard;
	public PCManual() {}
	public int getSeats() {
		return seats;
	}
	
	@Override
	public String toString() {
		return "PCManual [seats=" + seats + ", processor=" + processor + ", memory=" + memory + ", graphicsCard="
				+ graphicsCard + "]";
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public boolean isGraphicsCard() {
		return graphicsCard;
	}
	public void setGraphicsCard(boolean graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
	
	
}

