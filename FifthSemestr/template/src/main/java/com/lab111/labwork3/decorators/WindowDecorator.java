package com.lab111.labwork3.decorators;
import com.lab111.labwork3.Window;

import java.util.*;


/**
 * Class WindowDecorator - хранит ссылку на объект Window и определяет интерфейс, соответствующий
 * интерфейсу Window.
 */
abstract public class WindowDecorator extends Window {
    protected Window window;

    /**
     * Constructor
     * @param        window
     */
    public WindowDecorator(Window window) {
      this.window = window;
    }

    /**
     * print window
     */
    public void print() {
        window.print();
    }
}
