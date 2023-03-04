import java.util.Scanner;

class Main {
    /*
     * Linear Search
     * Best Case: (1)
     * Average and Worst Case: (n)
     */
    static int linear_search(int arr[], int key) {
        int n = arr.length;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        int key = sc.nextInt();
        int res = linear_search(arr, key);
        System.out.println(res >= 0 ? "Key found at index" + res : "Item Not found");\
        sc.close();
    }
}