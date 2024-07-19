
import java.util.Stack;

class HelloWorld {
    public static void main(String[] args) {
        String str = "hello,world";
        int top = -1;
        int size = 15;
        char stack[] = new char[size];
        for (int i =str.length()-1; i >= 0; i--) {
            stack[++top] = str.charAt(i);
            if(str.charAt(i)=='1'){
            stack[top] = str.charAt(i);
            }
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
        }
    }
}