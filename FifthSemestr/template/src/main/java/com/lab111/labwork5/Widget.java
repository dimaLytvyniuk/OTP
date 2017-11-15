package com.lab111.labwork5;

/**
 * Class Widget
 */
abstract public class Widget {
    //
    // Fields
    //

    /**
     * reference on mediator DialogDirector
     */
    private DialogDirector director;

    /**
     * coordinate x for widget
     */
    private int x;

    /**
     * coordinate y for widget
     */
    private int y;

    /**
     * width of widget
     */
    private int width;

    /**
     * height of widget
     */
    private int height;
  
    //
    // Constructors
    //
    public Widget (DialogDirector director, int width, int height, int x, int y) {
        this.director = director;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    };
  
    //
    // Methods
    //

    //
    // Accessor methods
    //

    /**
    * Get the value of x
    * @return the value of x
    */
    private int getX () {
    return x;
  }

    /**
    * Get the value of y
    * @return the value of y
    */
    private int getY () {
    return y;
  }

    /**
    * Get the value of width
    * @return the value of width
    */
    private int getWidth () {
    return width;
  }

    /**
    * Get the value of height
    * @return the value of height
    */
    private int getHeight () {
    return height;
  }

    //
    // Other methods
    //

    /**
     * Reaction on changing element
    */
    public void changed() {
        director.widgetChanged(this);
    }
}
