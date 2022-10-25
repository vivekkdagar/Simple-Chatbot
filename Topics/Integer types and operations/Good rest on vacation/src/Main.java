import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durInDays = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int oneWayFlight = scanner.nextInt();
        int oneNightHotel = scanner.nextInt();
        System.out.println(foodPerDay * durInDays + 2 * oneWayFlight + (durInDays - 1) * oneNightHotel);
    }
}