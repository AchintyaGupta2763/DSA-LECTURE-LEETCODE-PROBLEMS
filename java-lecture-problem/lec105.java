// paramaterized and non paramaterized
// here we also use constructor overloading (or function overloading)cls to make it better

public class lec105{
    public static void main(String args[]){
        // non paramaterized
        Student s1 = new Student();

        // paramaterized
        Student s2 = new Student("Achintya");
        System.out.println(s2.name);

        Student s3 = new Student(18);
        System.out.println(s3.roll);
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("constructor is called");;
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}