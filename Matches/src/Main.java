import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int line = 1;
        while (line == 1) {
            int a = inputN();
            minimumCountOfMatches(a);

        }
    }

    public static int inputN() {
        //   System.out.println("Enter a: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0 || n == 0) {
            while (n < 0 || n == 0) {
                System.out.println("n should be >0. Enter it again: ");
                n = input.nextInt();
                if (n > 0) {
                    break;
                }
            }
        }
        return n;
    }

    public static void minimumCountOfMatches(int a) {

        int matches_count = 0;
        int t = (int) Math.sqrt(a);

        matches_count = 2 * t * (t + 1);

        if ((Math.sqrt(a) - t) == 0) {
            matches_count = 2 * t * (t + 1);
        } else {
            if (a <= (t * t + t)) {
                for (int i = 1; i <= t; i++) {
                    if (a == (t * t + i)) {
                        matches_count = matches_count + 3 + 2 * (i - 1);
                    }

                }
            } else if (a > (t * t + t) && a < Math.pow((t + 1), 2)) {
                for (int i = 1; i <= t; i++) {
                    if (a == (Math.pow((t + 1), 2)) - i) {
                        matches_count = 2 * (t + 1) * (t + 2) - 2 * i;
                    }
                }
            }
        }
        // System.out.println("minimum count of matches: ");
        System.out.println(matches_count);

    }
}
