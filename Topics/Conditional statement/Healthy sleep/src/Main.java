import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int atLeast = scanner.nextInt();
        int limit = scanner.nextInt();
        int getting = scanner.nextInt();
        if (getting < atLeast) {
            System.out.println("Deficiency");
        } else if (getting > limit) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}