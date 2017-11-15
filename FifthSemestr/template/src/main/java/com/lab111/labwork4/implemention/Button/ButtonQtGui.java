package com.lab111.labwork4.implemention.Button;

public class ButtonQtGui implements ButtonImpl {
    @Override
    public void drawButton(int x, int y, int height, int width, String text) {
        System.out.println("Qt Draw Button: " + x +", " + y + ", " + height + ", " + width + ", " + text);
    }
}
