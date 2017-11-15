package com.lab111.labwork6;

public class CPUEquipment extends Equipment  {
    protected CPUEquipment(String name, int price, int power) {
        super(name, price, power);
    }

    @Override
    public void accept(EquipmentVisitor equipmentVisitor) {
        equipmentVisitor.visitCPU(this);
    }
}
