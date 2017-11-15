package com.lab111.labwork6;

public class HDDEquipment extends Equipment {
    protected HDDEquipment(String name, int price, int power) {
        super(name, price, power);
    }

    @Override
    public void accept(EquipmentVisitor equipmentVisitor) {
        equipmentVisitor.visitHDD(this);
    }
}
