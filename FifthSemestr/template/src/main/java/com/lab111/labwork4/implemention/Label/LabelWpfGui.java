package com.lab111.labwork4.implemention.Label;

public class LabelWpfGui  implements LabelImpl {
    @Override
    public void drawLabel(int x, int y, int height, int width, String text) {
        System.out.println("Wpf Draw Label: " + x +", " + y + ", " + height + ", " + width + ", " + text);
    }
}
