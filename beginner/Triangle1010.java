public class Triangle1010 {
    public static void main(String[] args) {
        int n = 7;
        // int k = 1;
        // for (int i = 1; i <= n; i++) {
        // if (i % 2 == 0) {
        // k = 0;
        // } else {
        // k = 1;
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(k + " ");

        // // if (k == 0)
        // // k = 1;
        // // else
        // // k = 0;

        // // (condition)?true:false
        // k = (k == 0) ? 1 : 0;
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }

    }

}
