import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int i = 2;
        // if (n % i == 0) {
        // System.out.println("not a prime number");
        // } else {
        // System.out.println(" prime number");
        // }

        int n = sc.nextInt();
        int i = 2;
        int j = 0;

        if ((n == 0) || (n == 1))
            j = 1;

        // for (; i < n; i++) {
        for (; i * i <= n; i++) {
            if (n % i == 0) {
                j = 1;
                break;
            }
        }

        if (j == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("non prime");
        }

    }

}
