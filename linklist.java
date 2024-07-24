public class linklist {
    public Node head=null;
    public Node tail=null;
    public static class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }

    }
    public void adddata(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;

        }
    }
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("the linkedlist is empty");
            return;
        }
        else{
            while(current!=null){
                System.out.println(current.data);
                current=current.next;

            }
        }
    }
    public void firstinsert(int data){
       Node newnode=new Node(data);
       newnode.next = head;
       head = newnode;

    }
    public void insert(){
        Node newnode=new Node(5);
        Node current =head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
        newnode.next=null;
    }
    public void mid(){
        Node f=head;
        Node s=head;
        if(head!=null){
            while(f!=null && f.next!=null){
                f=f.next.next;
                s=s.next;
            }
        }
        System.out.println("the middle element is "+s.data);
    }
   
    public static void main(String[] args) {
        linklist obj=new linklist();
        obj.adddata(1);
        obj.adddata(2);
        obj.adddata(3);
        obj.adddata(4);
        obj.display();
        obj.insert();
        System.out.println("after inserting a value at the end");
        obj.display();
        obj.mid();
        System.out.println("after inserting a value at the beginning");
        obj.firstinsert(9);
        obj.display();
    }
   
}
