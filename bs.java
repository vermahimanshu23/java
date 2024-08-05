public class bs {
    public static int binarySearchLast(int[] arr, int target) {
        int s = 0;
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

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 6};
        int target = 4;
        int lastIndex = binarySearchLast(arr, target);
        System.out.println("Last index of " + target + ": " + lastIndex);
    }
}
