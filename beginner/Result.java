import java.util.*;

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, marks;

        // do {
        // i = sc.nextInt();
        // if (i == 1) {
        // marks = sc.nextInt();
        // if (marks >= 90) {
        // System.out.println("This is Good");
        // } else if (marks >= 60 && marks <= 89) {
        // System.out.println("This is also Good");
        // } else {
        // System.out.println("This is Good as well");
        // }
        // }

        // } while (i == 1);

        do {
            i = sc.nextInt();
            if (i == 1) {
                marks = sc.nextInt();
                if (marks >= 90) { // 90-100
                    System.out.println("This is Good");
                } else if (marks >= 60) { // 60-100 but 90-100 is already checked which is false
                    System.out.println("This is also Good");
                } else { // remaining 0-59
                    System.out.println("This is Good as well");
                }
            }

        } while (i == 1);
    }

}
