package com.lab111.labwork5;

/**
 * Class Label
 */
public class Label extends Widget {
    //
    // Fields
    //

    /**
     *  Text on label
     */
    private String text;
  
    //
    // Constructors
    //

    /**
     * Constructor with initializing fields
     * @param director reference on mediator DialogDirector
     * @param width width of label
     * @param height height of
     * @param x coordinate x
     * @param y coordinate y
     * @param text
     */
    public Label(DialogDirector director, int width, int height, int x, int y, String text) {
        super(director, width, height, x, y);
        this.text = text;
    }

    //
    // Accessor methods
    //

    /**
     * Set the value of text and calling changed method from
     * Widget
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
