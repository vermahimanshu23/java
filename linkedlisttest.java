class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlisttest {
    public static boolean isCircularLinkedList(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
        
        return false;
    }
    
    public static Node findCircularNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        
        Node slow = head;
        Node fast = head;
        boolean isCircular = false;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                isCircular = true;
                break;
            }
        }
        
        if (!isCircular) {
            return null;
        }
        
        slow = head;
        
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
    
    public static void main(String[] args) {
        // Create a circular linked list
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Make it circular
        
        // Check if the linked list is circular
        boolean isCircular = isCircularLinkedList(head);
        System.out.println("Is the linked list circular? " + isCircular);
        
        // Find the node where it connects
        Node circularNode = findCircularNode(head);
        if (circularNode != null) {
            System.out.println("The linked list is circular and it connects at node with data: " + circularNode.data);
        } else {
            System.out.println("The linked list is not circular.");
        }
    }
}