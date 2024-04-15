// abstract class with abstract function and non abstract function
public class lec114 {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal();
        // a.eat();
        
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}