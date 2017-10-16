package com.lab111.labwork3.decorators;

import com.lab111.labwork3.Window;

/**
 * Class ScrollBarWindowDecorator - decorator is adding scroll on window.
 */
public class ScrollBarWindowDecorator extends WindowDecorator {

    /**
     * Constructor for initializing window with scrollbar
     * @param        window
     */
    public ScrollBarWindowDecorator(Window window) {
        super(window);
    }

    /**
     * print Window with scrollbar
     */
    public void print() {
        window.print();
        scrollBar();
    }

    /**
     * is adding scrollbar on Window
     */
    private void scrollBar() {
        System.out.println("ScrollBarWindowDecorator.scrollBar(): is adding new scrollbar on window.");
    }
}
