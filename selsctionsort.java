public class selsctionsort {
    public void selsctionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }

            }
        }
    }
    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};
        selsctionsort ob =new selsctionsort();
        ob.selsctionsort(arr);
        System.out.println("Sorted array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        
    }
    
}
