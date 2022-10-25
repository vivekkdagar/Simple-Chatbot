import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int sum = 0;
        String s = Integer.toString(n);
        for (int i = 0; i < 3; i++)
            sum += Character.getNumericValue(s.charAt(i));
        System.out.println(sum);
    }
}