package com.lab111.labwork5;

/**
 * Class DialogDirector
 */
abstract public class DialogDirector {
    //
    // Constructors
    //
    public DialogDirector () { };

    //
    // Other methods
    //

    /**
    * Listener which wait changing of widgets
    * @param        widget widget which was changed
    */
    abstract public void widgetChanged(Widget widget);

    /**
     * Showing Dialog window
     */
    abstract public void showDialog();

    /**
     * Creating widgets
     */
    abstract protected void createWidgets();
}
