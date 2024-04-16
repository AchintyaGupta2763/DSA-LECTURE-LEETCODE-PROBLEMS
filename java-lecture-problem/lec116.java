// abstraction with constructor

public class lec116 {
    public static void main(String args[]) {
        Mustang myHorse = new Mustang();
        // Animal - 
    }
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("constructor called");
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Constructor called");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}