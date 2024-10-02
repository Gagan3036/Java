final class ParentClass {
 void showData() {
    System.out.println("This is a method of final Parent class");
 }
} 
class ChildClass extends ParentClass{
 final void showData() {
    System.out.println("This is a method of Child class");
 }
 void showdata() {
    System.out.println("running");
    } 
}
class final_class {
 public static void main(String arg[]) {
 ParentClass obj = new ChildClass();
 obj.showData();
 }
}

/*
 * Output:-
 
final_class.java:6: error: cannot inherit from final ParentClass
class ChildClass extends ParentClass{
                         ^
1 error
 */