

public class HelloWorld1 {
    class Node {
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    
    public void addnode(int data ){
        Node newnode=new Node(data);
        if( head ==null)
        {
            head =newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
            
        }
    }
  
    public void display()
    {
        Node current=head;
        if(head== null)
        {
            System.out.println("the linked list is empty");
            return;
            
        }
        while (current!=null){
            System.out.println(current.data );
            current =current.next;
            
        }
        
    }
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        tail = head;  
        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;  
            current = next;  
        }
        head = prev;  
        
    }
    
    public static void main(String[] args) {
        HelloWorld1 slist=new HelloWorld1();
        slist.addnode(1);
        slist.addnode(2);
        slist.addnode(3);
        slist.display();
        slist.reverse();
        System.out.println("reverse list");
        slist.display();
       
    }
}