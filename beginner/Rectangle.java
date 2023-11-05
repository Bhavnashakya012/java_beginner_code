public class Rectangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println(" ");

        // }
        int totalStars = n * m;
        for (int i = 1; i <= totalStars; i++) {
            if ((i != 1) && (i % m == 1)) {
                System.out.println();
            }

            if (i <= m || i > (totalStars - m) || (i % m == 1) || (i % m == 0))
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }
}
