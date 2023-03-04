import java.util.Arrays;

/*
 *  Quick Sort Algorithm
 *  -> Recursive -> Divide and Conquer
 *  -> Time Complexities
 *     Best Case - (nlogn)
 *     Average Case - (nlogn)
 *     Worst Case - (n^2)
 */
class Main {
    static int partition(int[] arr, int l, int h) {
        int start = l;
        int end = h;
        int pivot = arr[l];
        int temp;
        while (start < end) {
            while (start <= h && arr[start] <= pivot)
                start++;
            while (end >= l && arr[end] > pivot)
                end--;
            if (start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            } else {
                temp = arr[l];
                arr[l] = arr[end];
                arr[end] = temp;
                break;
            }
        }

        return end;
    }

    static void quick_sort(int[] arr, int l, int h) {
        if (l < h) {
            int pi = partition(arr, l, h);
            quick_sort(arr, l, pi - 1);
            quick_sort(arr, pi + 1, h);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 90, 80, 70, 60, 50, 40 };
        System.out.print("Initial Array: ");
        System.out.println(Arrays.toString(arr));
        quick_sort(arr, 0, arr.length - 1);
        System.out.print("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
}