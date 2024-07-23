public class sorted {
    public static void main(String[] args) {
    int arr1[]={0,1,0,1,0,1,0};
    int s=0;
    int e=arr1.length-1;
    int temp;
        while(s<e){
            if(arr1[s]==0){
                s++;
            }
            else if(arr1[e]==1){
                e--;
            }
            else{
                temp=arr1[s];
                arr1[s]=arr1[e];
                arr1[e]=temp;
                s++;
                e--;
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    
}
