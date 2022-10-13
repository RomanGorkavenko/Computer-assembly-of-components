package HWSem5OOP.service.impl;

import HWSem5OOP.data.impl.ComputerCase;
import HWSem5OOP.service.PartsService;
import HWSem5OOP.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class ComputerCaseService extends PartsService<ComputerCase> implements ToCreateListAndSearchPartable<ComputerCase> {
    @Override
    public List<ComputerCase> toCreateList() {
        List<ComputerCase> list = new ArrayList<>();
        list.add(new ComputerCase("Code", "GC-MX3", "Slim Desktop"));
        list.add(new ComputerCase("HIPER", "ORO-4PGB", "Midi-Tower"));
        list.add(new ComputerCase("Cooler Master", "Elite 130", "HTPC"));
        return list;
    }
}
