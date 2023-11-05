import java.util.*;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();

        switch (Button) {

            case 1:
                System.out.println("Hello");
                for (int i = 1; i <= 10; i++) {
                    if (i == 3)
                        System.out.println("bsdk");
                    if (i % 3 == 0)
                        break;

                    System.out.println("okk");
                }

                break;
            // System.out.println("tatti"); // Unreachable code
            default:
                System.out.println("Invalid button");
                if (Button % 2 == 0) {
                    System.out.println("Chutiya");
                }
                // break;
            case 2:
                System.out.println("Namaste");
                // break; // if case 2 is given then due to absense of break code flow will
                // continue in switch unless it gets break or switch ends
            case 3:
                System.out.println("Bonjour");
                // break;

        }

    }

}
