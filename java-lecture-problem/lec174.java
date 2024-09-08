// doubly linked list reversed 

public class lec174 {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public lec174() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (size == 1) {
            head = tail = null;
            size--;
            return val;
        }

        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast() {
        if (tail == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        int val = tail.data;

        if (size == 1) {
            head = tail = null;
            size--;
            return val;
        }

        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        // Update head and tail pointers
        Node temp = head;
        head = tail;
        tail = temp;
    }

    public static void main(String[] args) {
        lec174 dll = new lec174();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println(dll.size);

        dll.reverse();
        dll.print(); // Print after reversing the list
        System.out.println(dll.size);
    }
}
