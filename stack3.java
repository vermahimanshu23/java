import java.util.Scanner;
public class stack3 {
    public static void main(String[] args) {
        int size=10;
        int[] stack=new int[size];
        int top=-1;
        while(true)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("1 : Push");
            System.out.println("2 : Pop");  
            System.out.println("3 : Peek");
            System.out.println("4 : traverse");
            System.out.println("5: Exit");
            System.out.println("Enter your choice");
            int ch = scan.nextInt();
            if(ch==1)
            {
                System.out.println("Enter the element to be inserted");
                int ele=scan.nextInt();
                stack.push(ele);

            }
            else if(ch==2)
            {

            }
            else if(ch==3)
            {

            }
            else if(ch==4)
            {

            }
            else if(ch==5)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }
        
    }

}
class stack{
    public static void push(int ele)
    {
        if(top==size-1)
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            stack[top]=ele;
        }
    }
    public static int pop()
    {
        
    }

}

