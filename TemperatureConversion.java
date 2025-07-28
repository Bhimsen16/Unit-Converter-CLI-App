import java.util.Scanner;

public class TemperatureConversion {

    public static void temperatureConverter(Scanner sc) {
        int choice;
        double celsius, fahrenheit;
        boolean goBackToMainMenu = false;

        do {
            System.out.println("\n--- Temperature Conversion ---");
            System.out.println("\n1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("Tip: Please choose a category or type 'back' to return to main menu.");

            choice = InputHelper.readIntegerInput(sc, "\nChoose conversion: ");
            if (choice == -1) {
                System.out.println("Back to main menu...");
                return; // or break;
            }

            switch (choice) {
                case 1 -> {
                    celsius = InputHelper.readDoubleInput(sc, "Enter value in celsius(°C): ");
                    
                    if (celsius == -1) {
                        System.out.println("Back to main menu...");
                        return; // or break;
                    }
                    fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println("Fahrenheit: " + fahrenheit + "°F");
                }

                case 2 -> {
                    fahrenheit = InputHelper.readDoubleInput(sc, "Enter value in fahrenheit(°F): ");
                    
                    if (fahrenheit == -1) {
                        System.out.println("Back to main menu...");
                        return; // or break;
                    }
                    celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println("Celsius: " + celsius + "°C");
                }

                case 3 -> {
                    celsius = InputHelper.readDoubleInput(sc, "Enter value in celsius(°C): ");
                    
                    if (celsius == -1) {
                        System.out.println("Back to main menu...");
                        return; // or break;
                    }
                    double kelvin = celsius + 273.15;
                    System.out.println("Kelvin: " + kelvin + "°K");
                }

                default -> {
                    System.out.println("Invalid choice! Choose options from menu.");
                }
            }

            if (goBackToMainMenu) {
                System.out.println("Returning to main menu...");
                break;
            }
        } while (true);
    }
}
