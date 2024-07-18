class stack{
    int stack[]=new int[5];
    int top=-1;
    int size=5;
    void push(int ele)
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
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Deleted element is -:"+stack[top]);
            top--;
        }
    }
    void peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Peek element is -:"+stack[top]);
        }
    }
    void display()
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
    public static void main(String args[])
    {
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.pop();
        s.display();
        s.peek();
    }
}