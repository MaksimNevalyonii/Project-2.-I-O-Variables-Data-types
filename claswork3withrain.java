import java.util.Scanner;

public class claswork3withrain{
    public static void main(String[] args) {
        System.out.println("Hello");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Is Raining? (yes/no): ");
        String isRaining = scanner.nextLine().trim().toLowerCase();

        if (isRaining.equals("yes")) {
            System.out.println("Stay at Home");
        } 
        else {
            System.out.println("Go to Park");
        }

        scanner.close();
    }
}