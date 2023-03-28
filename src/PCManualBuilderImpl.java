public class PCManualBuilderImpl implements PCManualBuilder {
		private PCManual pcManual;

		public PCManualBuilderImpl() {
			this.reset();
		}

		@Override
		public void reset() {
			this.pcManual = new PCManual();
		}

		@Override
		public void setSeats(int number) {
			this.pcManual.setSeats(number);
		}

		@Override
		public void setProcessor(String processor) {
			this.pcManual.setProcessor(processor);
		}

		@Override
		public void setMemory(String memory) {
			this.pcManual.setMemory(memory);
		}

		@Override
		public void setGraphicsCard(boolean graphicsCard) {
			this.pcManual.setGraphicsCard(graphicsCard);
		}

		public PCManual getResult() {
			PCManual result = this.pcManual;
			this.reset();
			return result;
		}

	}


