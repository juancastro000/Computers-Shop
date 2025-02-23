package dev.juan.computers_shop;

import java.util.ArrayList;
import java.util.List;

public class ComputersInventoryImpl implements ComputersInventory{

    private final List<Computer> inventory = new ArrayList<>();

    @Override
    public void addComputer(Computer computer){
        inventory.add(computer);
    }

    @Override
    public List<Computer> listed(){
        return new ArrayList<>(inventory);
    }

}
