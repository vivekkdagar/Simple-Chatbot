import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstName = scanner.next();
        String yearsOfXp = scanner.next();
        String cuisinePref = scanner.next();
        System.out.println("The form for " + firstName + " is completed. We will " +
                "contact you if we need a chef who cooks " + cuisinePref +
                " dishes and has " + yearsOfXp + " years of experience.");
    }
}