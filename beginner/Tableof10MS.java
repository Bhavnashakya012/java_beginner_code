import java.util.Scanner;

public class Tableof10MS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 10;

        for (int i = 1; i <= m; i++) {
            System.out.println(n * i);
        }
    }

}
