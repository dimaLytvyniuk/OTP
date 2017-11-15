package com.lab111.labwork4.abstraction;

import com.lab111.labwork4.implemention.GuiElementImpl;
import com.lab111.labwork4.implemention.TextBox.TextBoxImpl;

/**
 * TextBox object
 */
public class TextBox extends GuiElementWithText {
    TextBoxImpl textBoxImpl;
    /**
     * Constructor
     * @param height height of element
     * @param width width of element
     * @param x x coordinate
     * @param y y coordinate
     * @param background color of background
     * @param name name of element
     */
    public TextBox(int height, int width, int x, int y, int background, String name, TextBoxImpl textBoxImpl) {
        super(height, width, x, y, background, name);
        this.textBoxImpl = textBoxImpl;
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
    public TextBox(int height, int width, int x, int y, int background, String name,
                 String text, int fontSize, int margin, TextBoxImpl textBoxImpl) {
        super(height, width, x, y, background, name, text, fontSize, margin);
        this.textBoxImpl = textBoxImpl;
    }

    /**
     * Constructor
     * @param name name of element
     */
    public TextBox(String name, TextBoxImpl textBoxImpl) {
        super(name);
        this.textBoxImpl = textBoxImpl;
    }

    /**
     * draw TextBox
     */
    @Override
    public void draw() {
        System.out.println("Draw TextBox:");
        textBoxImpl.drawTextBox(x, y, height, width, text);
    }

    /**
     * add char c to TextBox
     * @param c
     */
    public void addToText(char c) {
        System.out.println("Add to text box: " + c);
        text += c;
        draw();
    }
}
