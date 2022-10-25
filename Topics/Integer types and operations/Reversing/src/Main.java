import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        StringBuilder input1 = new StringBuilder(Integer.toString(n));
        input1.reverse();
        if (input1.charAt(0) == '0') {
            input1.deleteCharAt(0);
        }
        System.out.println(input1);
    }
}
