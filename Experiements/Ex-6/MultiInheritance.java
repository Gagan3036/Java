/*
 * Multilevel inheritance - A class inherits properties from a class which 
 * again has inherits properties.
*/
class Shape{
    public void display() {
        System.out.println("Inside display");
    }
}
class Rectangle extends Shape{
    public void area() {
        System.out.println("Inside area");
    }
}
class Cube extends Rectangle{
    public void volume(){
        System.out.println("Inside volume");
    }
}
public class MultiInheritance{
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.display();
        cube.area();
        cube.volume();
    }
}
/*
 * Output:-
PS C:\Users\gagan\Documents\Repository\Java> cd "c:\Users\gagan\Documents\Repository\Java\Experiements\Ex-6\" ; if ($?) { javac MultiInheritance.java } ; if ($?) { java MultiInheritance }
Inside display
Inside area
Inside volume
*/