import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int peanutCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        if(weekend) {
            System.out.println(15 <= peanutCups && peanutCups <= 25);
        } else {
            System.out.println(10 <= peanutCups && peanutCups <= 20);
        }
    }
}