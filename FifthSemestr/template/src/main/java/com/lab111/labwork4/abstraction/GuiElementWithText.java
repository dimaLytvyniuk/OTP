package com.lab111.labwork4.abstraction;

import com.lab111.labwork4.implemention.GuiElementImpl;

public abstract class GuiElementWithText extends GuiElement {
    /**
     * text on Button
     */
    protected String text;
    /**
     * size of font in text on element
     */
    protected int fontSize;
    /**
     * margin for text
     */
    protected int margin;

    /**
     * Constructor
     * @param height height of element
     * @param width width of element
     * @param x x coordinate
     * @param y y coordinate
     * @param background color of background
     * @param name name of element
     */
    public GuiElementWithText(int height, int width, int x, int y, int background, String name) {
        super(height, width, x, y, background, name);
        text = new String();
        fontSize = 0;
        margin = 0;
    }

    /**
     * Constructor
     * @param height height of element
     * @param width width of element
     * @param x x coordinate
     * @param y y coordinate
     * @param background color of background
     * @param name name of element
     * @param text text on element
     * @param fontSize size of font in text on element
     * @param margin margin for text
     */
    public GuiElementWithText(int height, int width, int x, int y, int background, String name,
                              String text, int fontSize, int margin) {
        super(height, width, x, y, background, name);
        this.text = text;
        this.fontSize = fontSize;
        this.margin = margin;
    }

    /**
     * Constructor
     * @param name name of element
     */
    public GuiElementWithText(String name) {
        super(name);
        text = new String();
        fontSize = 0;
        margin = 0;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }
}
