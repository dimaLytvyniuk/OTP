package com.lab111.labwork4.abstraction;

import com.lab111.labwork4.implemention.Button.ButtonImpl;
import com.lab111.labwork4.implemention.GuiElementImpl;

/**
 * Button object
 */
public class Button extends GuiElementWithText {
    ButtonImpl buttonImpl;
    /**
     * Constructor
     * @param height height of element
     * @param width width of element
     * @param x x coordinate
     * @param y y coordinate
     * @param background color of background
     * @param name name of element
     */
    public Button(int height, int width, int x, int y, int background, String name, ButtonImpl buttonImpl) {
        super(height, width, x, y, background, name);
        this.buttonImpl = buttonImpl;
    }

    /**
     * Constructor
     * @param height height of element
     * @param width width of element
     * @param x x coordinate
     * @param y y coordinate
     * @param background color of background
     * @param name name of element
     * @param text text on Button
     * @param fontSize size of font in text on Button
     * @param margin margin for text
     */
    public Button(int height, int width, int x, int y, int background, String name,
                              String text, int fontSize, int margin, ButtonImpl buttonImpl) {
        super(height, width, x, y, background, name, text, fontSize, margin);
        this.buttonImpl = buttonImpl;
    }

    /**
     * Constructor
     * @param name name of element
     */
    public Button(String name, ButtonImpl buttonImpl) {
        super(name);
        this.buttonImpl = buttonImpl;
    }

    /**
     * draw Button
     */
    @Override
    public void draw() {
        System.out.println("Draw Button:");
        buttonImpl.drawButton(x,y,height,width, text);
    }

    /**
     * OnClick event
     */
    @Override
    public void onClick() {
        System.out.println("Button OnClick:");
        System.out.println("Do smth");
    }
}
