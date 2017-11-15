package com.lab111.labwork6;

public abstract class EquipmentVisitor {
    /**
     * Visit cpu
     * @param cpuEquipment
     */
    public abstract void visitCPU(CPUEquipment cpuEquipment);

    /**
     * Visit HDD
     * @param hddEquipment
     */
    public abstract void visitHDD(HDDEquipment hddEquipment);

    /**
     * Visit Video Card
     * @param videoCardEquipment
     */
    public abstract void visitVideoCard(VideoCardEquipment videoCardEquipment);

    /**
     * Visit Sound Card
     * @param soundCardEquipment
     */
    public abstract void visitSoundCard(SoundCardEquipment soundCardEquipment);

    /**
     * Visit PC
     * @param pcEquipment
     */
    public abstract void visitPC(PCEquipment pcEquipment);
}
