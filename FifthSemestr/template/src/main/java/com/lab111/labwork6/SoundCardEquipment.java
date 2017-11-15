package com.lab111.labwork6;

public class SoundCardEquipment extends Equipment {
    protected SoundCardEquipment(String name, int price, int power) {
        super(name, price, power);
    }

    @Override
    public void accept(EquipmentVisitor equipmentVisitor) {
        equipmentVisitor.visitSoundCard(this);
    }
}
