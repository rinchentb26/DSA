import java.util.Arrays;

class Main {

    static void bubble_sort(int[] arr) {
        int n = arr.length;
        boolean didSwap;
        for (int i = 0; i < n - 1; i++) {
            didSwap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = true;
                }
            }
            if (didSwap == false)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 123, 23, 13, 0, -2 };
        System.out.print("Initial Array: ");
        System.out.println(Arrays.toString(arr));
        bubble_sort(arr);
        System.out.print("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
}