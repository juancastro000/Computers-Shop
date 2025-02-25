package dev.juan.computers_shop;

import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
    private String name;
    private String owner;
    private String id;
    private ComputersInventory inventory;

    public ComputerStore(String name, String owner, String id, ComputersInventory inventory) {
        this.name = name;
        this.owner = owner;
        this.id = id;
        this.inventory = inventory;
    }
    public void addComputer(Computer computer) {
       inventory.addComputer(computer);
    }

    public void deleteComputer(Computer computer){
        inventory.deleteComputer(computer);
    }

    public Computer searchComputer(String brand){
        return inventory.findByBrand(brand);
    }

    public List<Computer> listComputers() {
        return inventory.listed();
    }
 }