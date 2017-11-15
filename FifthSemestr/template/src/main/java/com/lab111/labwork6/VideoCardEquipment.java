package com.lab111.labwork6;

public class VideoCardEquipment extends Equipment {
    protected VideoCardEquipment(String name, int price, int power) {
        super(name, price, power);
    }

    @Override
    public void accept(EquipmentVisitor equipmentVisitor) {
        equipmentVisitor.visitVideoCard(this);
    }
}
