public class reverse1 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
       
        int temp=0;
        int n=5;
        int rev=n;
         int count=0;
       for(int i=0;i<n;i++)
       {
        temp=ar[i];
        ar[i]=ar[n-1];
        ar[n-1]=temp;
        n--;
        
       }
       System.out.println(count);
       
       for(int j=0;j<rev;j++)
       {
        System.out.print(ar[j]);
       }

        
    }
}
