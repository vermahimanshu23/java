import java.util.Scanner;
public class MyQueue {
   public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       int size =5;
       int[] queue = new int[size];
       int front=-1, rear=-1;
       
      while(true){
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                if(rear==size-1){
                    System.out.println("Queue is full");
                }else{
                    System.out.println("Enter element to insert");
                    int ele = sc.nextInt();
                    if(front==-1){
                        front=0;
                    }
                    rear++;
                    queue[rear] = ele;
                }
                break;
                case 2:
                if(front==-1 || front==rear+1){
                    System.out.println("Queue is empty");
                }else{
                    System.out.println("Deleted element is -:"+queue[front]);
                    front++;
                }
                break;
                case 3:
                if(front==-1 || front==rear+1){
                    System.out.println("Queue is empty");
                }else{
                    System.out.println("Queue elements are");
                    for(int i=front; i<=rear; i++){
                        System.out.println(queue[i]);
                    }
                }
                break;
                case 4:
                System.exit(0);
                break;
                default:
                System.out.println("Invalid choice");
            }
      }
   }
}