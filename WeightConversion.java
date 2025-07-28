import java.util.Scanner;

public class WeightConversion {
    public static void weightConverter(Scanner sc) {
        int menu;
        double gram, kilogram;
        boolean goBackToMainMenu = false;

        do { 
            System.out.println("\n--- Weight Conversion ---");

            System.out.println("\n1. Gram to Kilogram");
            System.out.println("2. Kilogram to gram");
            System.out.println("Tip: Please choose a category or type 'back' to return to main menu.");
        
            menu = InputHelper.readIntegerInput(sc, "\nChoose conversion: ");
            if (menu == -1) {
                System.out.println("Back to main menu...");
                return; // or break;
            }

            switch (menu) {
                case 1 -> {
                    gram = InputHelper.readDoubleInput(sc, "Enter value in grams(g): ");

                    if (gram == -1) {
                        System.out.println("Back to main menu...");
                        return; // or break;
                    }
                    kilogram = gram / 1000;
                    System.out.println("Result: " + kilogram + "kg");
                }

                case 2 -> {
                    kilogram = InputHelper.readDoubleInput(sc, "Enter kilogram(kg): ");
                    
                    if (kilogram == -1) {
                        System.out.println("Back to main menu...");
                        return; // or break;
                    }
                    gram = kilogram * 1000;
                    System.out.println("Result: " + gram + "g");
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
