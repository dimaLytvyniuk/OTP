package com.lab111.labwork4.abstraction;

import com.lab111.labwork4.implemention.GuiElementImpl;
import com.lab111.labwork4.implemention.Label.LabelImpl;

/**
 * Label object
 */
public class Label extends GuiElementWithText {
    LabelImpl labelImpl;
    /**
     * Constructor
     * @param labelImpl gui implementor
     * @param height height of element
     * @param width width of element
     * @param x x coordinate
     * @param y y coordinate
     * @param background color of background
     * @param name name of element
     */
    public Label(LabelImpl guiElementImpl, int height, int width, int x, int y, int background, String name, LabelImpl labelImpl) {
        super(height, width, x, y, background, name);
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
    public Label(int height, int width, int x, int y, int background, String name,
                 String text, int fontSize, int margin, LabelImpl labelImpl) {
        super(height, width, x, y, background, name, text, fontSize, margin);
        this.labelImpl = labelImpl;
    }

    /**
     * Constructor
     * @param name name of element
     */
    public Label(String name, LabelImpl labelImpl) {
        super(name);
        this.labelImpl = labelImpl;
    }

    /**
     * draw label
     */
    @Override
    public void draw() {
        System.out.println("Draw Label:");
        labelImpl.drawLabel(x, y, height, width, text);
    }
}
