package dev.juan.computers_shop;

public class Computer {

    private String brand;
    private int memory;
    private String cpu;
    private String operatingSystem;
    private double price;

    public Computer(String brand, int memory, String cpu, String operatingSystem, double price) {
        this.brand = brand;
        this.memory = memory;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

}
