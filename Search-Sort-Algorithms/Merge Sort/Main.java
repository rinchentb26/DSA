import java.util.Arrays;

class Main {
    static void merge_sort(int arr[], int l, int h) {
        if (l < h) {
            // 80, 70 50 || 60, 40, 30
            // 80, 70 || 50 || 60, 40, 30
            int mid = l + (h - l) / 2;
            merge_sort(arr, l, mid);
            merge_sort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    static void merge(int[] arr, int l, int mid, int h) {
        int i = l;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[h - l + 1];
        while (i <= mid && j <= h) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= h) {
            temp[k++] = arr[j++];
        }
        k = 0;
        for (i = l; i <= h; i++) {
            arr[i] = temp[k++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 80, 70, 50, 60, 40, 30 };
        System.out.print("Initial Array: ");
        System.out.println(Arrays.toString(arr));
        merge_sort(arr, 0, arr.length - 1);
        System.out.print("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
}