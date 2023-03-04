import java.util.Scanner;

/*    Binary Search -> Array must be sorted
 *      Time Complexities:
 *          Best Case - O(1)
 *          Average and Worse Case - O(logn)
 */
class Main {
    // basic binary search
    static int binary_search(int[] arr, int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // when we dont know whether array is sorted in Ascending or Descending Order
    static int agnostic_bs(int[] arr, int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int mid;
        // finding whether array is ascending or descending
        boolean isAscend = arr[start] < arr[end];
        // 50 40 30 20 10
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (isAscend) {
                if (key > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (key > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        int key;
        key = sc.nextInt();
        int res = agnostic_bs(arr, key);
        System.out.println(res < 0 ? "Not Found" : "Item found at index " + res);
        sc.close();
    }
}