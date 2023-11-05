
// a, b are two variables ,and perform task a==b , a>b , a<b
import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("IS EQUAL");
        } else {
            if (a > b) {
                System.out.println("IS GREATER");
            } else {
                System.out.println("IS LESSER");
            }
        }
    }

}
