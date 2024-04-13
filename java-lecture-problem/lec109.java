// inheritance 
public class lec109{
    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
}

class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    int eats;
}