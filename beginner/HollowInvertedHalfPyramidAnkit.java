public class HollowInvertedHalfPyramidAnkit {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                if (j == i || j == n || i == 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
}
