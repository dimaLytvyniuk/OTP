package com.lab111;

import com.lab111.labwork2.C11;
import com.lab111.labwork2.C12;
import com.lab111.labwork2.C13;
import com.lab111.labwork2.If1;
import com.lab111.labwork2.If2;
import com.lab111.labwork2.If3;
import com.lab111.labwork3.*;
import com.lab111.labwork4.abstraction.Button;
import com.lab111.labwork4.abstraction.Image;
import com.lab111.labwork4.abstraction.Label;
import com.lab111.labwork4.abstraction.TextBox;
import com.lab111.labwork4.implemention.Button.ButtonQtGui;
import com.lab111.labwork4.implemention.Image.ImageWpfGui;
import com.lab111.labwork4.implemention.Label.LabelWpfGui;
import com.lab111.labwork4.implemention.QtGui;
import com.lab111.labwork4.implemention.TextBox.TextBoxWpfGui;
import com.lab111.labwork4.implemention.WinFormGui;
import com.lab111.labwork4.implemention.WpfGui;
import com.lab111.labwork5.DialogDirector;
import com.lab111.labwork5.ModalDialogDirector;
import com.lab111.labwork6.PCEquipment;
import com.lab111.labwork6.PowerEquipmentVisitor;
import com.lab111.labwork6.PriceEquipmentVisitor;
import com.lab111.labwork7.Redactor;
import com.lab111.labwork8.IMyIterator;
import com.lab111.labwork8.MyList;
import com.lab111.labwork8.TypeOfIterator;
import com.lab111.labwork9.*;

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
          TestLab7();
      }

     public static void TestLab6() {
         PCEquipment pc = new PCEquipment("Aerocool", 1000, 400);
         System.out.println(pc);
         PowerEquipmentVisitor power = new PowerEquipmentVisitor();
         PriceEquipmentVisitor price = new PriceEquipmentVisitor();

         pc.accept(power);
         pc.accept(price);
         System.out.println("Total power: " + power.getPower());
         System.out.println("Total price: " + price.getPrice());
     }

     public static void TestLab7() {
         Redactor redactor = new Redactor();
         System.out.println("Before Update");
         System.out.println(redactor);

         redactor.updateColorShape(1, 1126);
         redactor.updateColorShape(2, 1308);
         redactor.updateColorShape(4, 1228);
         redactor.updateSizeShape(3, 526);
         redactor.updateSizeShape(0, 666);
         redactor.updateCoordinates(6);
         redactor.updateCoordinates(5);

         System.out.println("After update:");
         System.out.println(redactor);

         redactor.cancelChanges(0);
         redactor.cancelChanges(3);
         redactor.cancelChanges(6);

         System.out.println("After canceling changes at #1, #4, #7");
         System.out.println(redactor);
     }
}
