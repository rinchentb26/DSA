class Main {
    static void insertion_sort(int arr[]) {
        int n = arr.length; // length of array
        int i, j, key;
        for (i = 1; i < n; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 88, 1, 90, 2, 77, 55 };
        insertion_sort(arr);
        display(arr);
    }
}