package com.lab111.labwork3;

import java.sql.Array;
import java.util.Arrays;

/**
 * Class Text - Component
 */
public class Text {
  /**
   * text
   */
  protected char[] symbols;

  //
  // Constructors
  //
  public Text (char[] symbols) {
      this.symbols = Arrays.copyOf(symbols, symbols.length);
  }

    /**
     * Set the value of symbols
     * @param newVar the new value of symbols
     */
    protected void setSymbols (char[] newVar) {
    symbols = newVar;
  }

    /**
     * Get the value of symbols
     * @return the value of symbols
     */
    public char[] getSymbols () {
    return symbols;
  }

    /**
     * print text
     */
    public void print() {
        System.out.print("(" + tostr(symbols) + ")");
    }








    public String tostr(char[] symbols) {
        String str = new String();
        for (int i = 0; i < symbols.length; i++)
            str += symbols[i];
        return str;
    }
}
