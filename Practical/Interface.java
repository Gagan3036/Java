//Multiple inheritance is implemented by interface

interface AnimalEat{
    void eat();
}
interface AnimalTravel{
    void travel();
}

class Animal implements AnimalEat, AnimalTravel{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void travel(){
        System.out.println("Animal is traveling");
    }
}

public class Interface {
    public static void main(String args[]){
        Animal a = new Animal();
        a.eat();
        a.travel();
    }
}