import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        if (-15 < n && n <= 12) {
            System.out.println("True");
        } else if (14 < n && n < 17) {
            System.out.println("True");
        } else if (19 <= n) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}