package HWSem5OOP.data.impl;

import HWSem5OOP.data.Parts;

public class ComputerCase extends Parts {

    private String standardSize;

    public ComputerCase(String brand, String model, String standardSize) {
        super(brand, model);
        this.standardSize = standardSize;
    }

    public String getStandardSize() {
        return standardSize;
    }

    public void setStandardSize(String standardSize) {
        this.standardSize = standardSize;
    }

    @Override
    public String toString() {
        return "Корпус " + getBrand() + " " + getModel() + ", Типоразмер: " + standardSize;
    }
}
