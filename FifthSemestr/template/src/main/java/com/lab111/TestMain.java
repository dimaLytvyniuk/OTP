package com.lab111;

import com.lab111.labwork2.C11;
import com.lab111.labwork2.C12;
import com.lab111.labwork2.C13;
import com.lab111.labwork2.If1;
import com.lab111.labwork2.If2;
import com.lab111.labwork2.If3;
import com.lab111.labwork3.*;

import java.util.Arrays;

/**
 * Template first class.
 * @author Dima
 *
 */
public final class TestMain {

  /**
   * Constructor.
   *
   */
  private TestMain() {
    super();
  }
  
  /**
   * Invokes at application startup.
   * @param args Parameters from command line
   */
  public static void main(final String[] args) {
      System.out.println("Simple window and text\n");
      TextEditor textEditor = new TextEditor();
      textEditor.print();

      textEditor.addBraceText(0);
      textEditor.addNewLineText(1);
      System.out.println("\nAfter adding barace to text and new line\n");
      textEditor.print();

      textEditor.setBackGroundWindow();
      textEditor.toLowerCaseText(2);
      System.out.println("\nAfter changing background color and change case of text to lower\n");
      textEditor.print();
  }


}
