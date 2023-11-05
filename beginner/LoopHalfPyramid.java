public class LoopHalfPyramid {
    public static void main(String[] args) {
        int n = 10;

        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= i; j++)
        // System.out.print("*");

        // System.out.println("");

        // }
        int i = 1;
        int j = 1;
        for (; i <= n;) {
            j--;
            System.out.print("*");
            if (j == 0) {
                System.out.println();
                // i++;
                // j=i;
                j = ++i;
            }
        }
    }
}
