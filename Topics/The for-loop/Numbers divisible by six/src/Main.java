import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int el = scanner.nextInt();
            if (el % 6 == 0) {
                sum += el;
            }
        }
        System.out.println(sum);
    }
}