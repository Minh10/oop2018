package week5_6;

import javax.swing.*;
import java.awt.*;

public class Graphic extends JFrame {
    public Graphic(String title){
        super(title);
    }
    public void showWindow(){
        this.setSize(900, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // render cho anh min hon
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);

        // bat dau ve
//        g2d.drawLine(0, 40, 30, 30);
//        g2d.drawString("Line", 0, 60);
//
//        g2d.drawPolyline(new int[]{50, 60, 70, 80, 90}, new int[]{20, 50, 20, 60, 10}, 5);
//        g2d.drawString("Polyline", 50, 70);
//
//        g2d.setColor(Color.RED);
//        g2d.drawRect(100, 30, 40, 60);
//        g2d.drawString("Rect", 100, 100);

        g2d.setColor(Color.ORANGE);
        g2d.fillArc(150, 30, 40, 40, 0, 360);
        g2d.translate(200,50);
        g2d.fillArc(200, 50, 40, 40, 0, 360);
        //g2d.drawString("Arc", 150, 80);

//        g2d.draw3DRect(220, 25, 60, 40, false);
//        g2d.drawString("3DRect", 220, 80);
//
//        g2d.drawRoundRect(290, 25, 60, 40, 10, 20);
//        g2d.drawString("RoundRect", 290, 80);
    }
}
