
public interface PCManualBuilder {
	void reset();

	void setSeats(int number);

	void setProcessor(String processor);

	void setMemory(String memory);

	void setGraphicsCard(boolean graphicsCard);

	PCManual getResult();

}


