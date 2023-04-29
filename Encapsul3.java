import java.awt.*;

class Point{
    int x,y;
    void getPoint(int a, int b) {
        x = a;
        y = b;
    }
}

public class Encapsul3 {
    static double distance;
    public static void main (String args[ ]){
        Point p1 = new Point( );
        Point p2 = p1;
        Point p3 = new Point();
        Point p4 = new Point();
        p1.getPoint(5, 10);
        p2.getPoint(15, 20);
        p3.getPoint(20,30);
        p4.getPoint(30,40);

        System.out.println("X1 = " + p1.x + "Y1 = " + p1.y);
        System.out.println("X2 = " + p2.x + "Y2 = " + p2.y);
    }
}
