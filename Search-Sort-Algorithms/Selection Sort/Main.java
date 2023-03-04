import java.util.Arrays;

class Main {

    static void selection_sort(int[] arr) {
        int n = arr.length;
        int i, j, k;
        for (i = 0; i < n - 1; i++) {
            k = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            if (k != i) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 0 };
        System.out.print("Initial Array: ");
        System.out.println(Arrays.toString(arr));
        selection_sort(arr);
        System.out.print("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
}