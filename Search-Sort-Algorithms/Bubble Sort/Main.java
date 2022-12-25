class Main {
    static void bubble_sort(int arr[]) {
        int n = arr.length;
        int i, j, temp;
        boolean swapped = false;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    static void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 7, 8, 10, 9 };
        bubble_sort(arr);
        display(arr);
    }
}