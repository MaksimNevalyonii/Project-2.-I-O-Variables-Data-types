package part1_arrays;

import java.util.Scanner;

public class Part1Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1.1. Variables
        int age = 18;
        double price = 10.5;
        char grade = 'A';
        boolean student = true;
        String name = "Max";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + student);

        // Part 1.2. Number operations
        int a = 20, b = 6;

        System.out.println("\nAddition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        a++;
        b--;
        System.out.println("Increment: " + a);
        System.out.println("Decrement: " + b);

        double x = 12.8;
        int y = (int) x;
        System.out.println("Casting: " + y);

        // Part 1.3. String operations
        String text = "Hello, " + name;
        System.out.println("\n" + text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Contains Max: " + text.contains("Max"));

        // Part 1.4. Input / Output
        System.out.print("\nEnter your city: ");
        String city = sc.nextLine();
        System.out.println("You live in " + city);

        // Part 1.5. Comments
        // Single-line comment

        /*
         * Multi-line comment
         */

        /**
         * Documentation comment
         */

        // Part 1.6. Debugger
        int debug = 10;
        debug++; // Put breakpoint here
        System.out.println("Debug value: " + debug);

        // Part 1.7. Compiler errors
        System.out.println("\nCompiler error examples:");
        System.out.println("Missing semicolon");
        System.out.println("Misspelled variable");
        System.out.println("Missing bracket");

        sc.close();
    }
}