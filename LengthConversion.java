import java.util.Scanner;

public class LengthConversion {

    public static void lengthConverter(Scanner sc) {
        int choose;
        double inch, feet;
        double meter, kilometer;

        System.out.println("\n1. Inches to Feet");
        System.out.println("2. Feet to Inches");
        System.out.println("3. Meter to Kilometer");
        System.out.println("4. Kilometer to Meter");
        System.out.println("Tip: Please choose a category or type 'back' to return to main menu.");

        do {
            System.out.println("\n--- Length Conversion ---");

            choose = InputHelper.readIntegerInput(sc, "\nChoose conversion: ");

            if (choose == -1) {
                System.out.println("Back to main menu...");
                return; // or break;
            }
            
            switch (choose) {
                case 1 -> {
                    inch = InputHelper.readDoubleInput(sc, "Enter value in inches(in): ");

                    if (inch == -1) {
                        System.out.println("Back to main menu...");
                        return; // or break;
                    }
                    feet = inch / 12;
                    System.out.println("Result: " + feet + "ft");
                }

                case 2 -> {
                    feet = InputHelper.readDoubleInput(sc, "Enter value in feet(ft): ");
                    
                    if (feet == -1) {
                        System.out.println("Back to main menu...");
                        return; // or break;
                    }
                    inch = feet * 12;
                    System.out.println("Result: " + inch + "in");
                }

                case 3 -> {
                    meter = InputHelper.readDoubleInput(sc, "Enter value in meter(m): ");
                    
                    if (meter == -1) {
                        System.out.println("Back to main menu...");
                        return; // or break;
                    }
                    kilometer = meter / 1000;
                    System.out.println("Result: " + kilometer + "km");
                }

                case 4 -> {
                    kilometer = InputHelper.readDoubleInput(sc, "Enter value in kilometer(km): ");
                    
                    if (kilometer == -1) {
                        System.out.println("Back to main menu...");
                        return; // or break;
                    }
                    meter = kilometer * 1000;
                    System.out.println("Result: " + meter + "m");
                }

                default -> {
                    System.out.println("Invalid choice! Choose options from menu.");
                }
            }
        } while (true);
    }
}
