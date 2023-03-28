
public class PCDirector {
private PCBuilder builder;
private PCManualBuilder manualBuilder;
public PCDirector(PCBuilder builder) {
    this.builder = builder;
}

public PCDirector(PCManualBuilder builder) {
    this.manualBuilder = builder;
}

public void constructGamingPC() {
    builder.setSeats(1);
    builder.setProcessor("Intel Core i7");
    builder.setMemory("16 GB");
    builder.setGraphicsCard(true);
}

public void constructHomePC() {
    manualBuilder.setSeats(1);
    manualBuilder.setProcessor("AMD Ryzen 5");
    manualBuilder.setMemory("8 GB");
    manualBuilder.setGraphicsCard(false);
}
}
