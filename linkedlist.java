public class linkedlist {
    public Node head;
    public Node tail;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        linkedlist linkedList = new linkedlist();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        linkedList.head = first;
        first.next = second;
        second.next = third;
        linkedList.displayList();
    }
}