// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet {

    public void paint(Graphics g) {
        // Draw Grid
        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);


        // Draw Random Lines
        Random rand = new Random();
        for (int k = 0; k <= 100; k++) {
            int x1 = rand.nextInt(391) + 10;
            int y1 = rand.nextInt(291) + 10;
            int x2 = rand.nextInt(391) + 10;
            int y2 = rand.nextInt(291) + 10;

            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            int blue = rand.nextInt(255);
            g.setColor(new Color(red, green, blue));


            g.drawLine(x1, y1, x2, y2);
        }


        // Draw Random Squares
        for (int k = 0; k <= 100; k++) {
            int x1 = rand.nextInt(341) + 400;
            int y1 = rand.nextInt(241) + 10;

            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            int blue = rand.nextInt(255);
            g.setColor(new Color(red, green, blue));

            g.fillRect(x1, y1, 50, 50);

        }
            // Draw Random Circles
            for(int k = 0; k <= 100; k++) {
                int diameter = rand.nextInt(200);
                int x1 = rand.nextInt(391 - diameter) + 10;
                int y1 = rand.nextInt(291 - diameter) + 300;

                int red = rand.nextInt(255);
                int green = rand.nextInt(255);
                int blue = rand.nextInt(255);
                g.setColor(new Color(red, green, blue));
                g.drawOval(x1, y1, diameter, diameter);

            }
                // Draw 3-D Box

                //yellow
                Polygon penta = new Polygon();
                penta.addPoint(600,480);
                penta.addPoint(500,480);
                penta.addPoint(500,380);
                penta.addPoint(600,380);
                g.fillPolygon(penta);

                //red
        Polygon penta2 = new Polygon();
        g.setColor(Color.red);
                penta2.addPoint(550,530);
                penta2.addPoint(650,530);
                penta2.addPoint(550,430);
                penta2.addPoint(650,430);
                g.fillPolygon(penta2);



    }
}



    
 