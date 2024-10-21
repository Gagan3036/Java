class OverloadDemo {
    
    void area(float x) {
        System.out.println("The area of the square is " + Math.pow(x, 2) + "sq units");
    }

    void area(float x, float y) {
        System.out.println("The area of rectagle is " + x * y + "sq units");
    }

    void area(double x){
        double z = 3.14 * x * x;
        System.out.println("The area of circle is "+ z + "sq units");
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();

        obj.area(5);
        obj.area(11, 12);
        obj.area(2.5);
    }
}
