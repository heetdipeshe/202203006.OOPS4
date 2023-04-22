import java.applet.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.Dimension;

public class oops1 extends Applet {

    TextField ta;
    String greeting;

    public void init() {

        ta = new TextField(10);

          add(ta);
    }

    public void paint(Graphics g) {

          g.drawString("Enter Your Name:",0,0);
          String string1;
          string1 = t1.getText();
          String greeting = "Hello "+string1;


        Dimension dimension = getSize();

        g.drawString(greeting,dimension.width/2,dimension.height/2);
    }
}