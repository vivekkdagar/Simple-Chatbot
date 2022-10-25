import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        double avg = 0;
        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                avg += i;
                count++;
            }
        }
        System.out.println(avg / count);
    }
}