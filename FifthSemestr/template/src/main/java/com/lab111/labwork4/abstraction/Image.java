package com.lab111.labwork4.abstraction;

import com.lab111.labwork4.implemention.GuiElementImpl;
import com.lab111.labwork4.implemention.Image.ImageImpl;

public class Image extends GuiElement {
    ImageImpl imageImpl;
    /**
     * path to image
     */
    protected String path;

    /**
     * Constructor
     * @param height height of element
     * @param width width of element
     * @param x x coordinate
     * @param y y coordinate
     * @param background color of background
     * @param name name of element
     * @param path path to image
     */
    public Image(int height, int width, int x, int y, int background, String name, String path, ImageImpl imageImpl) {
        super(height, width, x, y, background, name);
        this.path = path;
        this.imageImpl = imageImpl;
    }

    /**
     * Constructor
     * @param name name of element
     * @param path path to element
     */
    public Image(String name, String path, ImageImpl imageImpl) {
        super( name);
        this.path = path;
        this.imageImpl = imageImpl;
    }

    /**
     * draw image
     */
    @Override
    public void draw() {
        System.out.println("Print image:");
        imageImpl.drawImage(x, y, height, width, path);
    }

    /**
     * OnMouseMove image event
     */
    @Override
    public void onMouseMove() {
        System.out.println("OnMouseMove image:");
        System.out.println("Do smth");
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
        draw();
    }
}
