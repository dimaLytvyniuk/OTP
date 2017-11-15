package com.lab111.labwork6;

/**
 * Abstract Equipment class
 */
public abstract class Equipment {
    /**
     * Name of model
     */
    private String name;

    /**
     * Price
     */
    private int price;

    /**
     * Power
     */
    private int power;

    protected Equipment(String name, int price, int power) {
        this.name = name;
        this.price = price;
        this.power = power;
    }

    /**
     * Call visitor for concrete type of equipmentSS
     * @param equipmentVisitor
     */
    public abstract void accept(EquipmentVisitor equipmentVisitor);

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("%15s%6d%6d", name, price, power);
    }
}
