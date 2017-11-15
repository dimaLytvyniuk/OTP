package com.lab111.labwork4.implemention.Label;

public class LabelWinFormGui  implements LabelImpl {
    @Override
    public void drawLabel(int x, int y, int height, int width, String text) {
        System.out.println("WinForm Draw Label: " + x +", " + y + ", " + height + ", " + width + ", " + text);
    }
}
