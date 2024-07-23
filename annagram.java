import java.util.*;

class annagram {
    public static void main(String[] args) 
    {
        
        String str="listen";
        String str2="slient";
        int n = str.length();
        int n2 = str2.length();
        int count = 0;
        if(n!=n2){
            System.out.println("String is not anagram");
        }
        else{
            char[] arr1 = str.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int i=0;i<n;i++){
                if(arr1[i]!=arr2[i]){
                    count++;
                }
            }
            if(count==0){
                System.out.println("String is anagram");
            }
            else{
                System.out.println("String is not anagram");
            }
        }
    }
} 