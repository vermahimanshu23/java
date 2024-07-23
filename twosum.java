public class twosum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int n = arr.length;
       int s=0;
         int e=n-1;
            while(s<e){
                if(arr[s]+arr[e]==target){
                    System.out.println("["+s+","+e+"]");
                    break;
                }
                else if(arr[s]+arr[e]>target){
                    e--;
                }
                else{
                    s++;
                }
            }
    }
    
}
