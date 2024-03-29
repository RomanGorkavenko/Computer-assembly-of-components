package HWSem5OOP.data.impl;

import HWSem5OOP.data.Parts;

public class Ram extends Parts {
    private int theVolumeOfOneModule;

    public Ram(String brand, String model, int theVolumeOfOneModule) {
        super(brand, model);
        this.theVolumeOfOneModule = theVolumeOfOneModule;
    }

    public int getTheVolumeOfOneModule() {
        return theVolumeOfOneModule;
    }

    public void setTheVolumeOfOneModule(int theVolumeOfOneModule) {
        this.theVolumeOfOneModule = theVolumeOfOneModule;
    }

    @Override
    public String toString() {
        return  getBrand() + " " + getModel() + " " + theVolumeOfOneModule + " Gb.";
    }
}
