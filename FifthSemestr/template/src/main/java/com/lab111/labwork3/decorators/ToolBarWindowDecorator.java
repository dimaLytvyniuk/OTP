package com.lab111.labwork3.decorators;

import com.lab111.labwork3.Window;

/**
 * Class ToolBarWindowDecorator - decorator with adding toolbar on window
 */
public class ToolBarWindowDecorator extends WindowDecorator {
    /**
     * Constructor initialize Window with toolbar
     * @param window
     */
    public ToolBarWindowDecorator(Window window) {
        super(window);
    }

    /**
     * print window with toolbar
     */
    public void print() {
        window.print();
        toolBar();
    }


    /**
     * Create Toolbar
     */
    private void toolBar() {
        System.out.println("ToolBarWindowDecorator.addNewLine(): is adding toolbar on window.");
    }
}
