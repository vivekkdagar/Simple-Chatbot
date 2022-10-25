import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String text = scanner.nextLine();
        int lb = scanner.nextInt();
        int ub = scanner.nextInt();
        System.out.println(text.substring(lb, ub + 1));
    }
}