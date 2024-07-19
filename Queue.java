import java.util.Scanner;
class Queue{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=5;
        int queue[]=new int[size];
        int front=0;
        int rear=0;
        while(true)
        {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    if(rear==size)
                    {
                        System.out.println("Queue is full");
                    }
                    else
                    {
                        System.out.println("Enter element to insert");
                        int ele=sc.nextInt();
                        queue[rear]=ele;
                        rear++;
                    }
                    break;
                }
                case 2:
                {
                    if(front==rear)
                    {
                        System.out.println("Queue is empty");
                    }
                    else
                    {
                        System.out.println("Deleted element is -:"+queue[front]);
                        for(int i=0;i<rear-1;i++)
                        {
                            queue[i]=queue[i+1];
                        }
                        rear--;
                    }
                    break;
                }
                case 3:
                {
                    if(front==rear)
                    {
                        System.out.println("Queue is empty");
                    }
                    else
                    {
                        System.out.println("Queue elements are");
                        for(int i=front;i<rear;i++)
                        {
                            System.out.println(queue[i]);
                        }
                    }
                    break;
                }
                case 4:
                {
                    System.exit(0);
                }
            }
        }
    }
}
