public class linearsearch 

{
    public int search(int[] arr,int n,int m)
    {
        if (n==0){
            return -1;
        
        }
        else if(arr[n-1]==m){
            return n-1;
        }
        else{
            return search(arr,n-1,m);
        }
    }
    public static void main(String[] args) {
        linearsearch obj = new linearsearch();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int m = 5;
        System.out.println(obj.search(arr,n,m));
    }
}

