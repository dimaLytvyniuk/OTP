package com.lab111.labwork3.decorators;

        import com.lab111.labwork3.Text;

/**
 * Class AddNewLineTextDecorator - decorator for adding new line in the end
 * of text.
 */
public class AddNewLineTextDecorator extends TextDecorator {
    /**
     * Constructor initialized Text
     * @param        text
     */
    public AddNewLineTextDecorator(Text text) {
        super(text);
    }

    /**
     * print Text with new line
     */
    public void print() {
        addNewLine();
    }


    /**
     * Is adding new line in the end of Text.
     */
    private void addNewLine() {
        System.out.print(" addNewLine(");
        text.print();
        System.out.print(")");
    }
}
