import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        String numInString = Integer.toString(number);
        if (numInString.length() == 1) {
            System.out.println(0);
        } else {
            System.out.println(numInString.charAt(numInString.length() - 2));
        }
    }
}