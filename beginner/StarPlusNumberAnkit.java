public class StarPlusNumberAnkit {

    public static void main(String[] args) {

        int n = 8;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*");
            }

            for (int j = 1; j <= 8 - i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

}
