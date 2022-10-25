import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int[] arr = {second, third};
        Arrays.sort(arr);
        System.out.println(first >= arr[0] && first <= arr[1]);
    }
}