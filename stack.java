import java.util.Scanner;
import java.util.Stack;
public class stack 
{  int size=10;
    int [] stack=new int[size];
    int top=-1;
    
    Scanner scan=new Scanner(System.in);
   
    while(true)
    {
        System.out.println("Enter your choice");
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
         int ch=scan.nextInt();
       
    if (ch==1)
    {
        if(top==size-1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            System.out.println("Enter the element to be inserted");
            int ele=scan.nextInt();
            top++;
            stack[top]=ele;
        }
    }
}
    else if(ch==2)
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Deleted element is"+stack[top]);
            top--;
        }
    }
    else if(ch==3)
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack elements are");
            for(int i=top;i>=0;i--)
            {
                System.out.println(stack[i]);
            }
        }
    }
    else if(ch==4)
    {
        System.exit(0);
    }
    else
    {
        System.out.println("Invalid choice");
    }
   
}

}


    
