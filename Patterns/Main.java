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

    static void pattern_6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" " + " ");
            }
            for (int cols = 1; cols <= row; cols++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern_7(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 1; spaces <= rows - 1; spaces++) {
                System.out.print(" " + " ");
            }
            for (int cols = 1; cols <= n - rows + 1; cols++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern_8(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int spaces = 1; spaces <= n - rows; spaces++) {
                System.out.print(" " + " ");
            }
            for (int cols = 1; cols <= 2 * rows - 1; cols++) {
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
        System.out.println("\n\n");
        pattern_6(5);
        System.out.println("\n\n");
        pattern_7(5);
        System.out.println("\n\n");
        pattern_8(5);
    }
}