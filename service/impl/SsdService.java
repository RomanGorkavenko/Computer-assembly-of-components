package HWSem5OOP.service.impl;

import HWSem5OOP.data.impl.Ssd;
import HWSem5OOP.service.PartsService;
import HWSem5OOP.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class SsdService extends PartsService<Ssd> implements ToCreateListAndSearchPartable<Ssd> {
    @Override
    public List<Ssd> toCreateList() {
        List<Ssd> list = new ArrayList<>();
        list.add(new Ssd("Kingston", "SA400S37", 120));
        list.add(new Ssd("Netac", "NT01N600S", 256));
        list.add(new Ssd("Silicon Power", "SP120GBSS3S55S25", 120));
        list.add(new Ssd("Samsung", "MZ-V7S1T0BW", 1024));
        list.add(new Ssd("Netac", "NT01N930E", 256));
        list.add(new Ssd("Patriot", "P210S256G25", 256));
        return list;
    }
}
