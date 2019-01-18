
import java.util.*;

//calculation of area of figures 
public class CalculateArea {
    public static void main(String[] args) {
        String shape;
        Scanner scan = new Scanner(System.in);
        shape = scan.next();
        CalculateArea a = new CalculateArea();
        if (shape.equalsIgnoreCase("CIRCLE")) {
            System.out.println("Area IS " + a.circle());
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            System.out.println("Area IS " + a.rectangle());
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            System.out.println("Area IS " + a.square());
        } else if (shape.equalsIgnoreCase("TRIANGLE")) {
            System.out.println("Area IS " + a.triangle());
        } else {
            System.out.println("Invalid Input");
        }

    }

    public double circle() {
        double radius;
        System.out.println("Enter the radius of Circle for calculating the Area");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextInt();
        return 3.14 * radius * radius;
    }

    public int rectangle() {
        int length, breadth;
        System.out.println("Enter the length and breadth of Rectangle for calculating the Area");
        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        breadth = scan.nextInt();
        return length * breadth;
    }

    public int square() {
        int side;
        System.out.println("Enter the side of Square for calculating the Area");
        Scanner scan = new Scanner(System.in);
        side = scan.nextInt();
        return side * side;
    }

    public float triangle() {
        int altitude, base;
        System.out.println("Enter the altitude and base of Triangle for calculating the Area");
        Scanner scan = new Scanner(System.in);
        altitude = scan.nextInt();
        base = scan.nextInt();
        return (base * altitude / 2);
    }

}