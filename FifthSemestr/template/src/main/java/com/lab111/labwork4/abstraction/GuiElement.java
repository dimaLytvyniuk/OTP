package com.lab111.labwork4.abstraction;

import com.lab111.labwork4.implemention.GuiElementImpl;

/**
 * GuiElement - class of abstraction
 */
public abstract class GuiElement {
    /**
     * height of element
     */
    protected int height;
    /**
     * width width of element
     */
    protected int width;
    /**
     * x coordinate
     */
    protected int x;
    /**
     * y coordinate
     */
    protected int y;
    /**
     * color of background
     */
    protected int background;
    /**
     * name of element
     */
    protected String name;

    /**
     * Constructor
     * @param name name of element
     */
    public GuiElement(String name) {
        this.name = name;
        height = 0;
        width = 0;
        x = 0;
        y = 0;
        background = 0;
    }

    /**
     * Constructor
     * @param height height of element
     * @param width width of element
     * @param x x coordinate
     * @param y y coordinate
     * @param background color of background
     * @param name name of element
     */
    public GuiElement(int height, int width, int x, int y, int background, String name) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
        this.background = background;
        this.name = name;
    }

    /**
     * draw element
     */
    public abstract void draw();
    /**
     * OnClick event
     */
    public void onClick() {}

    /**
     * OnMouseMove event
     */
    public void onMouseMove() {}

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }
}
