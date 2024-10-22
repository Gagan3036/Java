class Shape {
    // Constructor for square
    Shape(float side) {
        System.out.println("Square created with side: " + side);
        System.out.println("Area of square: " + (side * side) + " sq units");
    }

    // Constructor for rectangle
    Shape(float length, float width) {
        System.out.println("Rectangle created with length: " + length + " and width: " + width);
        System.out.println("Area of rectangle: " + (length * width) + " sq units");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Shape square = new Shape(4); // Square with side 4
        Shape rectangle = new Shape(5, 3); // Rectangle with length 5 and width 3
    }
}