// problem statement
// ------------------------------------------------------------------------------------------------------
// write a code to assing the name 

// public class lec119 {
//     public static void main(String args[]) {
//         Student s = new Student();
//         s.name = "achintya";
//         System.out.println(s.name);
//     }    
// }

// class Student {
//     String name;
//     int marks;
// }

// ---------------------------------------------------------------------------------------------------

// implement the funtion the person Class can access

// public class lec119 {
//     public static void main(String args[]) {
//         Person p = new Person();
//         p.name ="achintya";
//         p.weight = 73;

//         System.out.println("name = "+p.name +", weight = "+p.weight);
//     }    
// }

// class Person{
//     String name;
//     int weight;
// }

// class Student extends Person{
//     int rollNumber;
//     String schoolName;
// }
//----------------------------------------------------------------------------------------------------

// parent class object can reference to child object
// Vehical v1 = new Car(); ☑️☑️☑️
// Car c1 = new Vehical(); ❌❌❌

//----------------------------------------------------------------------------------------------------

// public class lec119 {
//     public static void main(String args[]) {
//         Vehicle obj1 = new Car();
//         obj1.print(); // funtion overiding

//         Vehicle obj2 = new Vehicle();
//         obj2.print();
//     }
// }

// class Vehicle{
//     void print(){
//         System.out.println("base class vehical");
//     }
// }

// class Car extends Vehicle{
//     void print(){
//         System.out.println("Derived class");
//     }
// }

//----------------------------------------------------------------------------------------------------

// public class lec119 {
//     public static void main(String args[]) {
//         Vehicle obj1 = new Car();
//         obj1.print1();// error cause print1 is not in Vehicle

//         Vehicle obj2 = new Vehicle();
//         obj2.print();
//     }
// }

// class Vehicle{
//     void print(){
//         System.out.println("base class vehical");
//     }
// }

// class Car extends Vehicle{
//     void print1(){
//         System.out.println("Derived class");
//     }
// }

//----------------------------------------------------------------------------------------------------

public class lec119 {
    public static void main(String args[]) {
        System.out.println(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);
    }    
}

class Book{
    int price;
    static int count;

    public Book(int price){
        this.price = price;
        count++;
    }
}