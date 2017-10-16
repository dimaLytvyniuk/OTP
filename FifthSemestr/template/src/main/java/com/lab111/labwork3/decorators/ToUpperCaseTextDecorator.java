package com.lab111.labwork3.decorators;

        import com.lab111.labwork3.Text;
        import com.lab111.labwork3.decorators.TextDecorator;

/**
 * Class ToUpperCaseTextDecorator - decorator with change case to upper.
 */
public class ToUpperCaseTextDecorator extends TextDecorator {
    /**
     * Constructor initializing text with changed case to lower
     * @param text
     */
    public ToUpperCaseTextDecorator(Text text) {
        super(text);
    }

    /**
     * print with changed case to upper
     */
    public void print() {
        toUpper();
    }

    /**
     * change case of text to upper
     */
    private void toUpper() {
        System.out.print("ToUpper(");
        text.print();
        System.out.print(")");
    }
}
