// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Stack;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str = "hello,world";
        int top = -1;
        char stack[] = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != 'l') {
                top++;
                stack[top] = str.charAt(i);
            }

        }
        for (int i = top; i > 0; i--) {
            if (str.charAt(i) == 'l') {
                top++;
                stack[top] = str.charAt(i);
            }

        }
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print((char) stack[i]);
        }
    }
}