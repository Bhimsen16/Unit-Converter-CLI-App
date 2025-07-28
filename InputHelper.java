import java.util.Scanner;

public class InputHelper {
    public static double readDoubleInput(Scanner sc, String prompt) {
        double value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            String input = sc.next();

            if (input.equalsIgnoreCase("back")) {
                // handle going back to menu
                return -1; // or throw, or break
            }

            try {
                value = Double.parseDouble(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers only.");
            }
        }
        return value;
    }

    public static int readIntegerInput(Scanner sc, String prompt) {
        int value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            String input = sc.next();

            if (input.equalsIgnoreCase("back")) {
                // handle going back to menu
                return -1; // or throw, or break
            }

            try {
                value = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers only.");
            }
        }
        return value;
    }
}