import java.util.Scanner;

public class WholeOperationsMS {
    public static void main(String[] args) {

        // int a = 12;
        // int b = 36;

        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(b / a);
        // System.out.println(a * b);
        // System.out.println(a % b);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition is = " + (a + b));
        System.out.println("Subtraction is = " + (a - b));
        System.out.println("Divition is = " + (a / b));
        System.out.println("Multiplication is = " + (a * b));
        System.out.println("Modulus is = " + (a % b));

    }
}
