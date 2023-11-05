public class pyramid {
    public static void main(String[] args) {
        int n = 4;

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= n; i++) {
        // for (int j = 0; j <= (n - i); j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        int i = n;
        int j = i;
        for (; i >= 1;) {
            j--;
            System.out.print("*");
            if (j == 0) {
                System.out.println();
                // i--;
                // j=i;
                j = --i;
            }
        }
    }

}
