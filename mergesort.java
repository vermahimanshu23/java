public class mergesort {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] temp, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr, temp, start, mid);
        mergeSort(arr, temp, mid + 1, end);
        merge(arr, temp, start, mid, end);
    }

    private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
        for (int i = start; i <= end; i++) {
            temp[i] = arr[i];
        }
        int i = start;
        int j = mid + 1;
        int k = start;
        while (i <= mid && j <= end) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,3};
        mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
