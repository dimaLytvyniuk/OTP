package com.lab111.labwork3.decorators;

        import com.lab111.labwork3.Text;
        import com.lab111.labwork3.decorators.TextDecorator;

/**
 * Class ToLowerCaseTextDecorator - decorator with change case to lower.
 */
public class ToLowerCaseTextDecorator extends TextDecorator {
    /**
     * Constructor initializing text with changed case to lower
     * @param        text
     */
    public ToLowerCaseTextDecorator(Text text) {
        super(text);
    }

    /**
     * print with changed case to lower
     */
    public void print() {
        toLower();
    }

    /**
     * change case of text to lower
     */
    private void toLower() {
        System.out.print("ToLower(");
        text.print();
        System.out.print(")");
    }
}
