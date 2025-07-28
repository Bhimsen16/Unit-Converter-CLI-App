import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        int choice;
        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.println("\n╔═════════════════════════════╗");
                System.out.println("║     UNIT CONVERTER CLI      ║");
                System.out.println("╚═════════════════════════════╝");

                System.out.println("\nCategories: ");
                System.out.println("1. Length");
                System.out.println("2. Weight");
                System.out.println("3. Temperature");
                System.out.println("4. Exit");
            
                System.out.print("\nChoose a category: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        LengthConversion.lengthConverter(sc);
                    }

                    case 2 -> {
                        WeightConversion.weightConverter(sc);
                    }

                    case 3 -> {
                        TemperatureConversion.temperatureConverter(sc);
                    }

                    case 4 -> {
                        System.out.println("\nExciting!! Thanks for using the app.\n");
                        break;
                    }

                    default -> {
                        System.out.println("\nInvalid choice! Choose options from menu.");
                    }
                }
            } while(choice != 4);
        }
    }
}
