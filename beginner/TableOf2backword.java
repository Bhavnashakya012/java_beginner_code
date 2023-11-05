import java.util.*;

public class TableOf2backword {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 10;
        for (int i = m; i >= 1; i--) {
            System.out.println(n + " * " + i + " = " + n * i);

        }
    }

}
