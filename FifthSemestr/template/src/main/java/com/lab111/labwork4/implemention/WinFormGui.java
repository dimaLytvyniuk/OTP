package com.lab111.labwork4.implemention;

/**
 * WinForm implemention
 */
public class WinFormGui implements GuiElementImpl {
    @Override
    public void drawGui(int x, int y, int height, int width, int background) {
        System.out.println("WinFormGui draw: " + x + "," + y + "," + height + ","+ width + ","+ background);
    }

    @Override
    public void printText(String text, int fontSize, int margin, String parent) {
        System.out.println("WinFormGui print text on element: " + text + "," + fontSize + "," + margin);
    }

    @Override
    public void drawImage(String path, String parent) {
        System.out.println("WinFormGui drawImage on element: " + path + "," + parent);
    }

    @Override
    public void displayTip(int x, int y, String text) {
        System.out.println("WinFormGui display tip: " + text + "," + x +"," + y);
    }
}
