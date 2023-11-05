import java.util.*;

public class Result2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, marks;

        // do {
        // i = sc.nextInt();
        // if (i == 1) {
        // marks = sc.nextInt();
        // if (marks >= 90 && marks <= 100) {
        // System.out.println("this is good");
        // } else if (marks >= 60 && marks <= 89) {
        // System.out.println("this is also good");
        // } else if (marks >= 0 && marks <= 59) {
        // System.out.println("this is good as well");
        // } else {
        // System.out.println("Wrong input");
        // }

        // }
        // } while (i != 0);

        // do {
        // i = sc.nextInt();
        // if (i == 0)
        // break;

        // if (i == 1) {
        // marks = sc.nextInt();
        // if (marks >= 90 && marks <= 100) {
        // System.out.println("this is good");
        // } else if (marks >= 60 && marks <= 89) {
        // System.out.println("this is also good");
        // } else if (marks >= 0 && marks <= 59) {
        // System.out.println("this is good as well");
        // } else {
        // System.out.println("Wrong input");
        // }

        // }
        // } while (true);

        for (;;) {
            i = sc.nextInt();
            if (i == 0)
                break;

            if (i == 1) {
                marks = sc.nextInt();

                if (marks >= 101) {
                    System.out.println("Wrong input");
                } else if (marks >= 90) {
                    System.out.println("this is good");
                } else if (marks >= 60) {
                    System.out.println("this is also good");
                } else if (marks >= 0) {
                    System.out.println("this is good as well");
                } else {
                    System.out.println("Wrong input");
                }

            }
        }

    }
}
