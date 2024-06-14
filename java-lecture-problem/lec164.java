// remove first and last ka mera method
// nut mere method se remove last nahi ho payega

public class lec164 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("nothing to remove");
            return;
        }
        
        Node temp = head;
        temp = temp.next;
        head = temp;
    }
    public void removeLast(){
        Node temp = tail;
        temp = temp.next;
        tail = temp;
    }    
    
    public void size(){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            temp = temp.next;
            i++;
        }
        System.out.println("size od the link = "+ i);
    }

    public static void main(String[] args) {
    
        lec164 ll = new lec164();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.add(2,3);
        ll.print();
        ll.size();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
    
    }
}
