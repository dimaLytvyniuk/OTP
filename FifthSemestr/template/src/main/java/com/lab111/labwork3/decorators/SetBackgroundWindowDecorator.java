package com.lab111.labwork3.decorators;

import com.lab111.labwork3.Window;

/**
 * Class SetBackgroundWindowDecorator - decorator is changing background color of Window.
 */
public class SetBackgroundWindowDecorator extends WindowDecorator {
  /**
   * background color
   */
  private int color;

    /**
     * Set the value of color
     * @param newVar the new value of color
     */
    private void setColor (int newVar) {
      color = newVar;
    }

    /**
     * Get the value of color
     * @return the value of color
     */
    private int getColor () {
      return color;
    }

    /**
     * Constructor initialized window with background color.
     * @param        window
     * @param        color
     */
    public SetBackgroundWindowDecorator (Window window, int color) {
        super(window);
        this.color = color;
    }

    /**
     * print Window with background color
     */
    public void print() {
        window.print();
        setBackground();
    }

    /**
     * changing background of Window
     */
    private void setBackground() {
        System.out.println("SetBackgroundWindowDecorator.setBackground(): changing background of Window on " + color + ".");
    }
}
