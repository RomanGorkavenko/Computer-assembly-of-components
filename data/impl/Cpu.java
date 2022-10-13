package HWSem5OOP.data.impl;

import HWSem5OOP.data.Parts;

public class Cpu extends Parts {
    private String series;


    public Cpu(String brand, String model, String series) {
        super(brand, model);
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Процессор " + getBrand() + " " + getModel() + " " + series;
    }
}
