import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] arr = {a, b, c};
        boolean equals = false;
        Arrays.sort(arr);
        for (int i = 0; i < 2; i++) {
            if (arr[i] == arr[i + 1]) {
                equals = true;
                break;
            }
        }
        System.out.println(!equals);
    }
}