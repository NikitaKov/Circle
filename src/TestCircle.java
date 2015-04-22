/**
 * Created by student on 22.04.2015.
 */
public class TestCircle {// save as "TestCircle.java"

    public static void main(String[] args) {
        // Declare and allocate an instance of class Circle called c1
        //  with default radius and color

        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        // Declare and allocate an instance of class circlecalled c2
        //  with the given radius and default color
        System.out.println(c1.toString());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        Circle c3 = new Circle();
        c3.setRadius(5.0);
        c3.setColor("blue");

        System.out.println(c3.toString());
    }


}
