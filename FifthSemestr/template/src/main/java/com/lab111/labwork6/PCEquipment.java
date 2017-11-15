package com.lab111.labwork6;

public class PCEquipment extends Equipment {
    Equipment[] equipments;

    public PCEquipment(String name, int price, int power) {
        super(name, price, power);
        equipments = new Equipment[4];
        equipments[0] = new CPUEquipment("Intel i5", 320, 100);
        equipments[1] = new HDDEquipment("Western Digital", 200, 90);
        equipments[2] = new SoundCardEquipment("Asus", 160, 75);
        equipments[3] = new VideoCardEquipment("Nvidia", 280, 300);
    }

    @Override
    public void accept(EquipmentVisitor equipmentVisitor) {
        for (int i = 0; i < equipments.length; i++) {
            equipments[i].accept(equipmentVisitor);
        }

        equipmentVisitor.visitPC(this);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString() + "\n");
        for (int i = 0; i < equipments.length; i++)
            result.append(equipments[i] + "\n");

        return result.toString();
    }
}
