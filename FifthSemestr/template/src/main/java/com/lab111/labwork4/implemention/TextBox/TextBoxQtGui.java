package com.lab111.labwork4.implemention.TextBox;

public class TextBoxQtGui implements TextBoxImpl {
    @Override
    public void drawTextBox(int x, int y, int height, int width, String text) {
        System.out.println("Qt Draw TextBox: " + x +", " + y + ", " + height + ", " + width + ", " + text);
    }
}
