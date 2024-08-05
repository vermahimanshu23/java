public class binarysearch {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,3,3,4,5};
       int target =3;
        int s= 0;
        int e = arr.length - 1;
        int result = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                result = mid;
                s = mid + 1; 
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

       

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
        
        

    }

    
}
