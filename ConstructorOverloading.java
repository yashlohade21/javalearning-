class Circle2 {
    double x,y;
    double r;
    Circle2(double a, double b, double c){
        x = a; y = b; r = c;
    }
    Circle2(double c){
        x = 0; y = 0; r = c;
    }
    Circle2(Circle2 c){
        x = c.x; y = c.y; r = c.r;
    }
    Circle2() {
        x = 0.0; y = 0.0; r = 1.0;
    }
    double circumference() {
        return 2*3.14159*r;
    }
    double area() {
        return(22/7)*r*r;
    }
}

public class ConstructorOverloading {
    public static void main(String args[]){
        Circle2 c1 = new Circle2(3.0, 4.0, 5.0);
        Circle2 c2 = new Circle2(5.0);
        Circle2 c3 = new Circle2(c1);
        Circle2 c4 = new Circle2();

        System.out.println("CC1" + c1.circumference());
        System.out.println("AC1" + c1.area());
        System.out.println("CC2" + c2.circumference());
        System.out.println("AC2" + c2.area());
        System.out.println("CC3" + c3.circumference());
        System.out.println("AC3" + c3.area());
        System.out.println("CC4" + c4.circumference());
        System.out.println("AC4" + c4.area());
    }
}
