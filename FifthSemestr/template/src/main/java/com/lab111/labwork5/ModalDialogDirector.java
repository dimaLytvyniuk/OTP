package com.lab111.labwork5;

/**
 * Class ModalDialogDirector
 */
public class ModalDialogDirector extends DialogDirector {
    //
    // Fields
    //

    public Button button;
    public ListBox listBox;
    public TextBox textBox;
    public Label label;
  
    //
    // Constructors
    //
    public ModalDialogDirector () {
        createWidgets();
    }

    @Override
    public void widgetChanged(Widget widget) {
        if (widget == button) {
            System.out.println("User clicked on button");
            System.out.println("Text on label was changed from " + label.getText() + " on " + listBox.getCurrentItem());
            label.setText(listBox.getCurrentItem());
        } else if (widget == textBox) {
            System.out.println("Text in TextBox was changed and after that text on button will change");
            button.setText(textBox.getText());
        } else if (widget == listBox) {
            System.out.println("Index on ListBox was changed. After that text in TextBox will change.");
            textBox.setText(listBox.getCurrentItem());
        } else if (widget == label) {
            System.out.println("Text on label was changed");
        }
    }

    @Override
    public void showDialog() {
        System.out.println("Show items");
    }

    @Override
    protected void createWidgets() {
        String[] list = new String[5];
        list[0] = "1";
        list[1] = "2";
        list[2] = "3";
        list[3] = "4";
        list[4] = "5";
        button = new Button(this, 50, 100, 150, 300, "button");
        listBox = new ListBox(this, 200, 300, 10, 10, list);
        textBox = new TextBox(this, 100, 50, 30, 80);
        label = new Label(this, 100, 50, 50, 100, "Label");
    }

    @Override
    public String toString() {
        String result = new String();
        result += "ListBox current item: " + listBox.getCurrentItem() + "\n";
        result += "TextBox text: " + textBox.getText() + "\n";
        result += "Label text: " + label.getText() + "\n";
        result += "Button text: " + button.getText() + "\n";

        return result;
    }
}
