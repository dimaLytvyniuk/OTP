package com.lab111.labwork4.implemention;

import com.lab111.labwork4.abstraction.GuiElement;

/**
 * Qt implemention
 */
public class QtGui implements GuiElementImpl {
    @Override
    public void drawGui(int x, int y, int height, int width, int background) {
        System.out.println("QtGui draw: " + x + ", " + y + ", " + height + ", " + width + ", "+ background);
    }

    @Override
    public void printText(String text, int fontSize, int margin, String parent) {
        System.out.println("QtGui print text on element: " + text + ", " + fontSize + ", " + margin);
    }

    @Override
    public void drawImage(String path, String parent) {
        System.out.println("QtGui drawImage on element: " + path + ", " + parent);
    }

    @Override
    public void displayTip(int x, int y, String text) {
        System.out.println("QtGui display tip: " + text + ", " + x +", " + y);
    }
}
