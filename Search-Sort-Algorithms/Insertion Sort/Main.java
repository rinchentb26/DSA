import java.util.Arrays;

class Main {
    static void insertion_sort(int[] arr) {
        int n = arr.length;
        int i, j, temp;
        for (i = 1; i < n; i++) {
            temp = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 43, 23, 13, 0, -2 };
        System.out.print("Initial Array: ");
        System.out.println(Arrays.toString(arr));
        insertion_sort(arr);
        System.out.print("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
}