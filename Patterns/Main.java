class Main {
    static void pattern_1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern_2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern_3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern_4(int n) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern_5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalCols = row > n ? n - (row - n) : row;
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("\n\n");
        pattern_1(5);
        System.out.println("\n\n");
        pattern_2(5);
        System.out.println("\n\n");
        pattern_3(5);
        System.out.println("\n\n");
        pattern_4(5);
        System.out.println("\n\n");
        pattern_5(5);
    }
}