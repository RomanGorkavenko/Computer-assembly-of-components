package HWSem5OOP.controller;

import HWSem5OOP.builder.ComputerBuilder;
import HWSem5OOP.data.Computer;

public class ControllerBuilder {
    private final ComputerBuilder computerBuilder;

    public ControllerBuilder() {
        this.computerBuilder = new ComputerBuilder();
    }

    public Computer getComputerAccordingToTheDesiredCriteria(String motherBoard, String cpu, String raw, String ssd,
                                                             String graphicsCard, String powerSupply,
                                                             String computerCase){
        computerBuilder.setMotherBoard(motherBoard);
        computerBuilder.setCpu(cpu);
        computerBuilder.setRaw(raw);
        computerBuilder.setSsd(ssd);
        computerBuilder.setGraphicsCard(graphicsCard);
        computerBuilder.setPowerSupply(powerSupply);
        computerBuilder.setComputerCase(computerCase);

        return computerBuilder.computerBuilder();
    }


}
