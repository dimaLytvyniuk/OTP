package com.lab111.labwork3.decorators;

        import com.lab111.labwork3.Text;

/**
 * Abstract class TextDecorator - хранит ссылку на объект Text и определяет интерфейс, соответствующий
 * интерфейсу Text.
 */
abstract public class TextDecorator extends Text {
    /**
     * reference on Text object
     */
    protected Text text;

    /**
     * Constructor
     * @param        text
     */
    public TextDecorator(Text text) {
        super(text.getSymbols());
        this.text = text;
    }


    /**
     * call print of text
     */
    public void print() {
        text.print();
    }
}
