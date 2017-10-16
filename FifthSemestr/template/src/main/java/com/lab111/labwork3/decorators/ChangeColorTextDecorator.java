package com.lab111.labwork3.decorators;

import com.lab111.labwork3.Text;

/**
 * Class ChangeColorTextDecorator - decorator is changing color of Text.
 */
public class ChangeColorTextDecorator extends TextDecorator {
    /**
     * Color of text
     */
    private int color;

    /**
     * Get the value of color
     * @return the value of color
     */
    private int getColor () {
      return color;
    }

    /**
     * set color
     * @param color
     */
    private void setColor(int color) { this.color = color; }

    /**
     * @param        text
     * @param        color
     */
    public ChangeColorTextDecorator(Text text, int color) {
        super(text);
        this.color = color;
    }


    /**
     * print text with changing color
     */
    public void print() {
        this.changeColor();
    }


    /**
     * changing color of text
     */
    private void changeColor() {
        System.out.print(" ChangeColor(" + color + ")(");
        text.print();
        System.out.print(")");
    }


}
