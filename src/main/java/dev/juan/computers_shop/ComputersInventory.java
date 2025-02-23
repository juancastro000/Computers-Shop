package dev.juan.computers_shop;
import java.util.List;

public interface ComputersInventory {
    void addComputer(Computer computer);
    List<Computer> listed();
}
