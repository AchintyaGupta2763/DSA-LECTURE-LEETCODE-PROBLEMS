// linked list mei manually add karna but alag se class banae
//tab node ko class ke sath . operator laga ke likhna hoga 
// plus hum function bhi bahar likhe



// this is not possible becasue a class object can't use a outside funtion that 
// tries to operate the inner variabels of the class
// basically object doesn't recognizes it

// class LinkedList{
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
// }

// public static LinkedList.Node head;
// public static LinkedList.Node tail;

// public void addFirst(int data){
//     LinkedList.Node newNode= new LinkedList.Node(data);

//     if(head == null){
//         head = tail = newNode;
//         return;
//     }
    
//     newNode.next = head;
//     head = newNode;
// }  

// public class lec160{
//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.head = new LinkedList.Node(1);
//         ll.head.next = new LinkedList.Node(2);   
//         ll.addFirst(1);
//         ll.addFirst(2);
//     } 
// }

