import java.util.*;

public class lec49{
    public static void main(String args[]){
        int marks[] = new int[100];

        Scanner scan = new Scanner(System.in);
        marks[0] = scan.nextInt();// phy
        marks[1] = scan.nextInt();// chem
        marks[2] = scan.nextInt();// maths

        System.out.println("physics:- "+marks[0]);
        System.out.println("chem:- "+marks[1]);
        System.out.println("maths:- "+marks[2]);

        marks[2] = 100;
        System.out.println("maths :- "+marks[2]);


        System.out.print("length of the array "+marks.length);
        
    }
}