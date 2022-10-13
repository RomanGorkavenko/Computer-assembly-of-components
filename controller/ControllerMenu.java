package HWSem5OOP.controller;

import HWSem5OOP.service.impl.*;

import java.util.Scanner;

public class ControllerMenu {

    private final MotherBoardService motherBoardService;
    private final CpuService cpuService;
    private final RamService ramService;
    private final SsdService ssdService;
    private final GraphicsCardService graphicsCardService;
    private final PowerSupplyService powerSupplyService;
    private final ComputerCaseService computerCaseService;
    private final ControllerBuilder controllerBuilder;

    public ControllerMenu() {
        this.motherBoardService = new MotherBoardService();
        this.cpuService = new CpuService();
        this.ramService = new RamService();
        this.ssdService = new SsdService();
        this.graphicsCardService = new GraphicsCardService();
        this.powerSupplyService = new PowerSupplyService();
        this.computerCaseService = new ComputerCaseService();
        this.controllerBuilder = new ControllerBuilder();
    }

    public void menu(){
        System.out.println("Соберите себе компьютер!\nПросто выберите детали из списка");
        String partsNumber = "Введите номер детали";

        motherBoardService.print(motherBoardService.toCreateList());
        int motherBoardNumber = inputNumber(partsNumber);
        String motherBoard = motherBoardService.searchParts(motherBoardNumber, motherBoardService.toCreateList());

        cpuService.print(cpuService.toCreateList());
        int cpuNumber = inputNumber(partsNumber);
        String cpu = cpuService.searchParts(cpuNumber, cpuService.toCreateList());

        ramService.print(ramService.toCreateList());
        int ramNumber = inputNumber(partsNumber);
        String ram = ramService.searchParts(ramNumber, ramService.toCreateList());

        ssdService.print(ssdService.toCreateList());
        int ssdNumber = inputNumber(partsNumber);
        String ssd = ssdService.searchParts(ssdNumber, ssdService.toCreateList());

        graphicsCardService.print(graphicsCardService.toCreateList());
        int graphicsCardNumber = inputNumber(partsNumber);
        String graphicsCard = graphicsCardService.searchParts(graphicsCardNumber, graphicsCardService.toCreateList());

        powerSupplyService.print(powerSupplyService.toCreateList());
        int powerSupplyNumber = inputNumber(partsNumber);
        String powerSupply = powerSupplyService.searchParts(powerSupplyNumber, powerSupplyService.toCreateList());

        computerCaseService.print(computerCaseService.toCreateList());
        int computerCaseNumber = inputNumber(partsNumber);
        String computerCase = computerCaseService.searchParts(computerCaseNumber, computerCaseService.toCreateList());

        System.out.println(controllerBuilder.getComputerAccordingToTheDesiredCriteria(motherBoard, cpu, ram, ssd,
                            graphicsCard, powerSupply, computerCase));
    }

    public int inputNumber(String str) {
        Scanner input = new Scanner(System.in);
        System.out.println(str);
        int num;
        if (input.hasNextInt()) {
            num = input.nextInt();
        } else {
            System.out.println("Ошибка ввода.");
            input.next();
            num = inputNumber(str);
        }
        return num;
    }
}
