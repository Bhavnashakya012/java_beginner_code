public class TwoInputHalfDiamond {
    public static void main(String[] args) {

        int m = 3;
        int n = 4;
        int k = m;
        for (int i = 1; i <= n; i++, k++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        k -= 2;
        for (int i = n - 1; i >= 1; i--, k--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
