package com.lab111.labwork3;
import com.lab111.labwork3.decorators.*;

import java.util.*;


/**
 * Class TextEditor - used text and window
 */
public class TextEditor {
    private Text text[];
    private Window window;

    //
    // Constructors
    //
    public TextEditor () {
      text = new Text[4];
      window = new Window();
      text[1] = new Text("dsasad".toCharArray());
      text[2] = new Text("s;lf fdsj fdsl;g".toCharArray());
      text[3] = new Text("adfhklal".toCharArray());
      text[0] = new Text("skjsahg".toCharArray());
    }

    /**
     * Set the value of window
     * @param newVar the new value of window
     */
    private void setWindow (Window newVar) {
      window = newVar;
    }

    /**
     * Get the value of window
     * @return the value of window
     */
    private Window getWindow () {
      return window;
    }

    /**
     */
    public void print() {
        window.print();
        for (int i = 0; i < 4; i++) {
            text[i].print();
            System.out.print(" ");
        }
    }

    /**
     */
    public void addNewLineText(int index) {
        text[index] = new AddNewLineTextDecorator(text[index]);
    }


    /**
     */
    public void toLowerCaseText(int index) {
        text[index] = new ToLowerCaseTextDecorator(text[index]);
    }

    /**
     */
    public void toUpperCaseText(int index) {
        text[index] = new ToUpperCaseTextDecorator(text[index]);
    }

    /**
     */
    public void changeColorText(int index) {
        text[index] = new ChangeColorTextDecorator(text[index], 255);
    }

    /**
     */
    public void addBraceText(int index) {
        text[index] = new AddBraceTextDecorator(text[index]);
    }

    /**
     */
    public void addToolBarWindow(int index) {
        window = new ToolBarWindowDecorator(window);
    }

    /**
     */
    public void addScrollBarWindow(int index) {
        window = new ScrollBarWindowDecorator(window);
    }

    /**
     */
    public void setBackGroundWindow() {
        window = new SetBackgroundWindowDecorator(window, 789);
    }
}
