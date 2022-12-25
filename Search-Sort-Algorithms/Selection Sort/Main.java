class Main {
    static void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    static void selection_sort(int arr[]) {
        int n = arr.length;
        int i, j, k, temp;
        for (i = 0; i < n - 1; i++) {
            k = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 99, 22, 33, 44, -3, 2 };
        selection_sort(arr);
        display(arr);
    }
}