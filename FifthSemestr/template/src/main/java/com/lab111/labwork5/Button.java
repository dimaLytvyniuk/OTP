package com.lab111.labwork5;

/**
 * Class Button
 */
public class Button extends Widget {
    /**
     * Text on button
     */
    private String text;

    /**
     * Constructor with parameters to initialize fields
     * @param director mediator DialogDirector
     * @param width width of button
     * @param height height of button
     * @param x coordinate x for button
     * @param y coordinate y for button
     */
    public Button(DialogDirector director, int width, int height, int x, int y, String text) {
      super(director, width, height, x, y);
      this.text = text;
    }

    //
    // Accessor methods
    //

    /**
    * Set the value of text
    * @param newVar the new value of text
    */
    public void setText (String newVar) {
        text = newVar;
    }

    public String getText() {
        return text;
    }
    //
    // Other methods
    //

    /**
     * OnClick event for button which call chaged method
     * from widget
     */
    public void onClick() {
        changed();
    }
}
