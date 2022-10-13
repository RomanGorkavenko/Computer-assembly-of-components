package HWSem5OOP.service.impl;

import HWSem5OOP.data.impl.Cpu;
import HWSem5OOP.service.PartsService;
import HWSem5OOP.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class CpuService extends PartsService<Cpu> implements ToCreateListAndSearchPartable<Cpu> {

    @Override
    public List<Cpu> toCreateList() {
        List<Cpu> cpu = new ArrayList<>();
        cpu.add(new Cpu("Intel", "CORE", "i5"));
        cpu.add(new Cpu("Intel", "CORE", "i7"));
        cpu.add(new Cpu("AMD", "Ryzen", "7"));
        cpu.add(new Cpu("Intel", "Pentium", "G6405"));
        cpu.add(new Cpu("AMD", "Ryzen", "5"));
        return cpu;
    }
}
