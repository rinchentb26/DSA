class Main {
    /*
     * Linear Search
     * Best Case: (1)
     * Average and Worst Case: (n)
     */
    static Boolean linear_search(int arr[]) {
        int n = arr.length;
        int key = 11; // element we want to search for
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = { 22, 33, 44, 55, 11 };
        System.out.println(linear_search(arr));
    }
}