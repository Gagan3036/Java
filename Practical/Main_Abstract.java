/*
*Abstract class: is a restricted class that cannot be used
*to create objects (to access it, it must be inherited from another class).

*Abstract method: can only be used in an abstract class, 
*and it does not have a body. The body is provided by the subclass (inherited from).
 */
//Abstract class 
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep(){
        System.out.println("Zzz...");
    }
}

// Subclass (inherit from Animal)
class Pig extends Animal{
    public void animalSound(){
       // The body of animalSOund() is provided here
       System.out.println("The pig says: wee wee") ;
    }
}

class Main_Abstract {
    public static void main(String[] args){
        Pig myPig = new Pig(); // Create a Pig Object 
        myPig.animalSound();
        myPig.sleep();
    }
}