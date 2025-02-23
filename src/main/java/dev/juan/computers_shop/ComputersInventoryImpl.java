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
    public void deleteComputer(Computer computer){
        inventory.remove(computer);
    }

    @Override
    public List<Computer> listed(){
        return new ArrayList<>(inventory);
    }

    @Override
    public Computer findByBrand(String brand){
        return inventory.stream()
                        .filter(computer -> computer.getBrand().equalsIgnoreCase(brand))
                        .findFirst()
                        .orElse(null);
    }

}
