import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = scanner.nextInt();
        int max = 0;
        for (int i = 1; i <= count; i++) {
            int element = scanner.nextInt();
            if (element % 4 == 0 && element > max) {
                max = element;
            }
        }
        System.out.println(max);
    }
}