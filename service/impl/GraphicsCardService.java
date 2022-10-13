package HWSem5OOP.service.impl;

import HWSem5OOP.data.impl.GraphicsCard;
import HWSem5OOP.service.PartsService;
import HWSem5OOP.service.ToCreateListAndSearchPartable;

import java.util.ArrayList;
import java.util.List;

public class GraphicsCardService extends PartsService<GraphicsCard> implements ToCreateListAndSearchPartable<GraphicsCard> {
    @Override
    public List<GraphicsCard> toCreateList() {
        List<GraphicsCard> list = new ArrayList<>();
        list.add(new GraphicsCard("GIGABYTE", "GeForce", "RTX 3060"));
        list.add(new GraphicsCard("MSI", "GeForce", "RTX 3050"));
        list.add(new GraphicsCard("GIGABYTE", "AORUS GeForce", "RTX 3080 Ti"));
        list.add(new GraphicsCard("Sapphire", "Radeon", "RX6600 8GB"));
        list.add(new GraphicsCard("GIGABYTE", "Radeon", "RX6600XT"));
        return list;
    }
}
