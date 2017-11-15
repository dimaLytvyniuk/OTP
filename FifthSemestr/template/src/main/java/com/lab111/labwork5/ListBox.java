package com.lab111.labwork5;
/**
 * Class ListBox
 */
public class ListBox extends Widget {
    //
    // Fields
    //

    /**
     * List of elements
     */
    private String[] list;

    /**
     * Current checked index
     */
    private int currentIndex;
  
    //
    // Constructors
    //

    /**
     * Constructor with initializing fields
     * @param director reference on mediator DialogDirector
     * @param width width of listbox
     * @param height height of listbox
     * @param x coordinate of x
     * @param y coordinate of y
     * @param list list of elements
     */
    public ListBox(DialogDirector director, int width, int height, int x, int y, String[] list) {
        super(director, width, height, x, y);
        this.list = list;
        currentIndex = 0;
    }

    //
    // Accessor methods
    //

    /**
     * Set the value of list
     * And call changed method
     * @param newVar the new value of list
     */
    private void setList (String[] newVar) {
        list = newVar;
        changed();
    }

    /**
     * Get the value of currentIndex
     * @return the value of currentIndex
     */
    private int getCurrentIndex () {
    return currentIndex;
  }

    //
    // Other methods
    //

    /**
     * @return      Current item that checked in listbox
     */
    public String getCurrentItem() {
        return list[currentIndex];
    }

    /**
     * @param        index index of element that was checked
     */
    public void changeCurrentIndex(int index) {
        if (index >= 0 && index < list.length) {
            currentIndex = index;
            changed();
        }
    }
}
