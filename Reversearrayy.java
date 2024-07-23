import java.util.*;
public class Reversearrayy {
    public static void main(String[]args){
        String s = "nitin";
        char temp;
        int st = 0;
        int n = s.length();
        int end = n-1;
        char[] arr = s.toCharArray();
        while(st<end){
            temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
        if (s.equals(new String(arr))) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}