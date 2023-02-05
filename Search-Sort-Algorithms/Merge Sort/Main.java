class Main {
    public static void merge(int arr[], int left, int right, int mid) {
        int[] temp = new int[right - left + 1];
        int i, j, k;
        i = left;
        j = mid + 1;
        k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        k = 0;
        for (i = left; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void display(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge_sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            merge_sort(arr, left, mid);
            merge_sort(arr, mid + 1, right);
            merge(arr, left, right, mid);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 99, 0, 102, -4, -2, -99, 12, 1 };
        display(arr, arr.length);
        merge_sort(arr, 0, arr.length - 1);
        display(arr, arr.length);
    }
}