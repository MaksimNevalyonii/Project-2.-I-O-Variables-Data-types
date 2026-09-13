package part2_dialog;

import java.util.Scanner;

public class Part2Dialog {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("        PERSONAL CHATBOT");
        System.out.println("=================================");
        System.out.println("Hello! I am your personal chatbot.");
        System.out.println("I will ask you several questions.");
        System.out.println("Let's get started!\n");


        // Part 2.1. Input String - Name
        System.out.println("Expected data type: String");
        System.out.print("What is your first name? ");
        String firstName = scanner.nextLine();


        // Part 2.2. Input String - Last Name
        System.out.println("\nExpected data type: String");
        System.out.print("What is your last name? ");
        String lastName = scanner.nextLine();


        // Part 2.3. Input int - Age
        System.out.println("\nExpected data type: int");
        System.out.print("How old are you? ");
        int age = scanner.nextInt();


        // Part 2.4. Input double - Height
        System.out.println("\nExpected data type: double");
        System.out.print("What is your height in meters? ");
        double height = scanner.nextDouble();


        // Remove the remaining newline
        scanner.nextLine();


        // Part 2.5. Input char - Favorite Letter
        System.out.println("\nExpected data type: char");
        System.out.print("What is your favorite letter? ");
        char favoriteLetter = scanner.nextLine().charAt(0);


        // Part 2.6. Input boolean - Student
        System.out.println("\nExpected data type: boolean");
        System.out.print("Are you a student? Enter true or false: ");
        boolean isStudent = scanner.nextBoolean();

        scanner.nextLine();


        // Part 2.7. Input String - City
        System.out.println("\nExpected data type: String");
        System.out.print("What city do you live in? ");
        String city = scanner.nextLine();


        // Part 2.8. Input int - Number of Siblings
        System.out.println("\nExpected data type: int");
        System.out.print("How many siblings do you have? ");
        int siblings = scanner.nextInt();

        scanner.nextLine();


        // Part 2.9. Input String - Hobby
        System.out.println("\nExpected data type: String");
        System.out.print("What is your favorite hobby? ");
        String hobby = scanner.nextLine();


        // Part 2.10. Input String - Favorite Food
        System.out.println("\nExpected data type: String");
        System.out.print("What is your favorite food? ");
        String favoriteFood = scanner.nextLine();


        // Part 2.11. Input double - Number
        System.out.println("\nExpected data type: double");
        System.out.print("What is your favorite number? ");
        double favoriteNumber = scanner.nextDouble();

        scanner.nextLine();


        // Part 2.12. Input String - Dream
        System.out.println("\nExpected data type: String");
        System.out.print("What is your dream for the future? ");
        String dream = scanner.nextLine();


        // Part 2.13. Chatbot String Operations
        System.out.println("\n=================================");
        System.out.println("          CHATBOT ANALYSIS");
        System.out.println("=================================");

        String introduction =
                "My name is " + firstName + " and I live in " + city + ".";

        // contains()
        if (introduction.contains(firstName)) {
            System.out.println("Chatbot: I found your name in your introduction!");
        }

        // startsWith()
        if (firstName.startsWith("A")) {
            System.out.println("Chatbot: Your name starts with A!");
        } else {
            System.out.println("Chatbot: Your name does not start with A.");
        }

        // indexOf()
        int namePosition = introduction.indexOf(firstName);

        System.out.println(
                "Chatbot: Your name starts at position "
                        + namePosition
                        + " in the introduction."
        );


        // More String operations
        System.out.println("\n=== Additional Chatbot Analysis ===");

        if (hobby.toLowerCase().contains("game")) {
            System.out.println("Chatbot: Gaming sounds fun!");
        } else {
            System.out.println("Chatbot: Your hobby sounds interesting!");
        }

        if (favoriteFood.toLowerCase().startsWith("p")) {
            System.out.println("Chatbot: Your favorite food starts with P!");
        }

        int foodPosition =
                favoriteFood.toLowerCase().indexOf("a");

        if (foodPosition >= 0) {
            System.out.println(
                    "Chatbot: The letter 'a' appears in your favorite food "
                            + "at position " + foodPosition + "."
            );
        }


        // Part 2.14. Final Summary
        System.out.println("\n=================================");
        System.out.println("          PERSONAL SUMMARY");
        System.out.println("=================================");

        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " m");
        System.out.println("Favorite letter: " + favoriteLetter);
        System.out.println("Student: " + isStudent);
        System.out.println("City: " + city);
        System.out.println("Number of siblings: " + siblings);
        System.out.println("Favorite hobby: " + hobby);
        System.out.println("Favorite food: " + favoriteFood);
        System.out.println("Favorite number: " + favoriteNumber);
        System.out.println("Dream: " + dream);

        System.out.println("\nThank you for talking with me, " + firstName + "!");
        System.out.println("It was nice to learn more about you.");

        scanner.close();
    }
}