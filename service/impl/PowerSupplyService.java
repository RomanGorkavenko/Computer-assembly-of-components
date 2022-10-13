package HWSem5OOP.service.impl;

import HWSem5OOP.data.impl.PowerSupply;
import HWSem5OOP.service.PartsService;
import HWSem5OOP.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class PowerSupplyService extends PartsService<PowerSupply> implements ToCreateListAndSearchPartable<PowerSupply> {
    @Override
    public List<PowerSupply> toCreateList() {
        List<PowerSupply> list = new ArrayList<>();
        list.add(new PowerSupply("HIPER", "HPB-550RGB", 550));
        list.add(new PowerSupply("XPG", "Pylon", 650));
        list.add(new PowerSupply("Cooler Master", "Elite V3", 400));
        list.add(new PowerSupply("Chieftec Photon", "CTG-650C-RGB", 650));
        return list;
    }
}
