public class lec110{
    public static void main(String args[]){
        Mammals dog = new Mammals();
        dog.eat();
        dog.breathe();
        dog.walks();

        Birds crow = new Birds();
        crow.eat();
        crow.breathe();
        crow.fly();

        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
        
    }
}

class Animal{
    String color;
    
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammals extends Animal{
    void walks(){
        System.out.println("walk");
    }
}


class Birds extends Animal{
    void fly(){
        System.out.println("fly");
    }
}


class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}