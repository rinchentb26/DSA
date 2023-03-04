import java.util.Scanner;

class Main {
    /*
     * Linear Search
     * Best Case: (1)
     * Average and Worst Case: (n)
     */

    // linear search for 1d array
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

    // linear search for 2d Array
    static int[] linear_2d_search(int[][] arr, int key) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = { 1, 2, 3, 4, 5 };
        int[][] arr2 = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        int key = sc.nextInt();
        // int res = linear_search(arr, key);
        int[] ans = linear_2d_search(arr2, key);
        System.out.println(ans[0] >= 0 ? "Key found at row " + ans[0] + " at column " + ans[1] : "Key NOT FOUND");
        // System.out.println(res >= 0 ? "Key found at index" + res : "Item Not found");
        sc.close();
    }
}