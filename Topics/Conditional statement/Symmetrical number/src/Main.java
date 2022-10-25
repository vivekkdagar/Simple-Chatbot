import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        StringBuilder h1 = new StringBuilder(Integer.toString(n));
        if (h1.reverse().toString().equals(Integer.toString(n))) {
            System.out.println(1);
        } else {
            System.out.println(78);
        }
    }
}