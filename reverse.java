import java.util.Scanner;
public class reverse {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int n=sc.nextInt();
        int sum=0;
        int rev;
        while(n>0){
            rev=n%10;
            sum=sum*10+rev;
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
