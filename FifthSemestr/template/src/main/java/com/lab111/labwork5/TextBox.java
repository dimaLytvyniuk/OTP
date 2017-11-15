package com.lab111.labwork5;

/**
 * Class TextBox
 */
public class TextBox extends Widget {
    //
    // Fields
    //

    /**
     * Text in textbox
     */
    private String text;
    //
    // Constructors
    //

    /**
     * Constructor with initialized fields
     * @param director reference on mediator DialogDirector
     * @param width width of widget
     * @param height height of widget
     * @param x coordinate x of widget
     * @param y coordinate y of widget
     */
    public TextBox(DialogDirector director, int width, int height, int x, int y) {
      super(director, width, height, x, y);
      text = new String();
    }

    //
    // Accessor methods
    //

    /**
     * Set the value of text
     * And call changed method
     * @param newVar the new value of text
     */
    public void setText (String newVar) {
        text = newVar;
        changed();
    }

    /**
     * Get the value of text
     * @return the value of text
     */
    public String getText () {
    return text;
  }
}
