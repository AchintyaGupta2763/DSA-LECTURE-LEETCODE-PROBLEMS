// inheritance 
public class lec108{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breadth(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;
     void swim(){
        System.out.println("swims in water");
     }


}