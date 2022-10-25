import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int perfect = 0;
        int needFixing = 0;
        int reject = 0;
        for (int i = 1; i <= n; i++) {
            int el = scanner.nextInt();
            if (el == 1) {
                needFixing++;
            } else if (el == -1) {
                reject++;
            } else if (el == 0) {
                perfect++;
            }
        }
        System.out.println(perfect + " " + needFixing + " " + reject);
    }
}