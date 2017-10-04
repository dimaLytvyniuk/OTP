package com.lab111;

import com.lab111.labwork2.C11;
import com.lab111.labwork2.C12;
import com.lab111.labwork2.C13;
import com.lab111.labwork2.If1;
import com.lab111.labwork2.If2;
import com.lab111.labwork2.If3;

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
	  int v1 = 5408 % 9;
	  int v2 = 5408 % 5;
	  System.out.println(v1);
	  System.out.println(v2);
  }

}
