
	public interface PCBuilder {
		void reset();

		void setSeats(int number);

		void setProcessor(String processor);

		void setMemory(String memory);

		void setGraphicsCard(boolean graphicsCard);

		PC getResult();
	
	}

