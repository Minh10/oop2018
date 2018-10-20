package week5_6;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Layer myLayer = new Layer();
        System.out.println(myLayer.toString());
        System.out.println("Tao các Shape trong 1 layer----------------------------------------");

        myLayer.deleteTriangle();

        System.out.println(myLayer.toString());
        System.out.println("Xoa các Triangle trong 1 layer--------------------------------------");

        Diagram myDiagram = new Diagram();

        System.out.println(myDiagram.toString());
        System.out.println("Tao các Layer trong 1 diagram------------------------------------");

        myDiagram.deleteCircle();

        System.out.println(myDiagram.toString());
        System.out.println("Xóa các Circle trong 1 diagram----------------------------");

    }
}

