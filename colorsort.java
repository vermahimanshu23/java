public class colorsort {
    public static void main(String[] args){
        int[] nums={2,0,2,1,0,1,2,0,1};
        int s=0;
        int e=nums.length-1;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                temp=nums[s];
                nums[s]=nums[i];
                nums[i]=temp;
                s++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                temp=nums[s];
                nums[s]=nums[i];
                nums[i]=temp;
                s++;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==2){
                temp=nums[e];
                nums[e]=nums[i];
                nums[i]=temp;
                e--;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
