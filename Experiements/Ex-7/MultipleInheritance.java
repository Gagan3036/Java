/*
 * Multiple inheritance by interface occurs if a class implements multiple 
 * interfaces or also if an interface itself extends multiple interfaces.
 */
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
        System.out.println("Animal is travelling");
    }
}
public class MultipleInheritance{
    public static void main(String args[]){
        Animal a = new Animal();
        a.eat();
        a.travel();
    }
}
/*
* Output:- 

PS C:\Users\gagan\Documents\Repository\Java\Experiements\Ex-7> cd "c:\Users\gagan\Documents\Repository\Java\Experiements\Ex-7\" ; if ($?) { javac MultipleInheritance.java } ; if ($?) { java MultipleInheritance }
Animal is eating
Animal is travelling
 */