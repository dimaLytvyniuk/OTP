package com.lab111.labwork4.implemention;

import com.lab111.labwork4.abstraction.GuiElement;

/**
 * interface of implementation drawing gui objectives
 */
public interface GuiElementImpl {
    /**
     * draw gui element
     * @param x x coordinate
     * @param y y coordinate
     * @param height height of element
     * @param width width of element
     * @param background color of background
     */
    void drawGui(int x, int y, int height, int width, int background);

    /**
     * Print text on parent element
     * @param text text to print
     * @param fontSize size of font in text
     * @param margin margin for element
     * @param parent parent for element
     */
    void printText(String text, int fontSize, int margin, String parent);

    /**
     * Draw image for parent element
     * @param path path to image
     * @param parent parent of elements
     */
    void drawImage(String path, String parent);

    /**
     * Display tip
     * @param x x coordinate
     * @param y y coordinate
     * @param text text for tip
     */
    void displayTip(int x, int y, String text);
}

