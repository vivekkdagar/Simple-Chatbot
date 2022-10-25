import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int s1 = a + b;
        int s2 = b + c;
        int s3 = a + c;
        System.out.println(s1 == 20 || s2 == 20 || s3 == 20);
    }
}