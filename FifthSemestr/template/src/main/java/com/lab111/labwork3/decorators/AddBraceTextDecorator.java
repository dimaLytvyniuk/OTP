package com.lab111.labwork3.decorators;

import com.lab111.labwork3.Text;

import java.util.Arrays;

/**
 * Class AddBraceTextDecorator - decorator for adding brace in the end
 */
public class AddBraceTextDecorator extends TextDecorator {
    /**
     * Constructor for initializing Text
     * @param        text
     */
    public AddBraceTextDecorator(Text text) {
        super(text);
    }


    /**
     * print Text with brace
     */
    public void print() {
        addBrace();
    }

    /**
     * Adding brace in the end of text
     */
    private void addBrace() {
        System.out.print(" addBrace(");
        text.print();
        System.out.print(")");
    }
}
