package HWSem5OOP.service.impl;

import HWSem5OOP.data.impl.MotherBoard;
import HWSem5OOP.service.PartsService;
import HWSem5OOP.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class MotherBoardService extends PartsService<MotherBoard> implements ToCreateListAndSearchPartable<MotherBoard> {
    @Override
    public List<MotherBoard> toCreateList() {
        List<MotherBoard> list = new ArrayList<>();
        list.add(new MotherBoard("MSI", "ATX MPG", 4));
        list.add(new MotherBoard("ASRock", "H510M-HDV", 2));
        list.add(new MotherBoard("GIGABYTE", "MATX H410M", 2));
        list.add(new MotherBoard("MSI", "ATX Z590 PRO", 4));
        return list;
    }
}
