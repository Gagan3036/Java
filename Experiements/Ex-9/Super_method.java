class Person {
 void message()
 {
    System.out.println("This is person class\n");
 }
}
class Student extends Person {
 void message()
 {
    System.out.println("This is student class");
 }
 void display()
 {
    message();
    super.message();
 }
}
class Super_method {
 public static void main(String args[])
 {
    Student s = new Student();
    s.display();
 }
}

/*
 * Output:- 
This is student class
This is person class
 */