public class test1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target[] = {3, 4, 5, 1, 2};
        int n = arr.length;
        int rotations = -1;

        for (int k = 0; k < n; k++) {
            boolean isEqual = true;

            
            for (int i = 0; i < n; i++) {
                if (arr[i] != target[i]) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) {
                rotations = k;
                break;
            }

            
            int temp = arr[n-1];
            for (int i = n-1; i > 0; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }

        if (rotations != -1) {
            System.out.println("Array matches target array after " + rotations + " rotations.");
        } else {
            System.out.println("Array cannot be matched with target array by rotations.");
        }
    }
}
