import java.util.*;

public class Oddeve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("EVEN NUMBER");
        } else {
            System.out.println("ODD NUMBER");
        }

    }
}
