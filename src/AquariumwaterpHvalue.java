import java.util.Scanner;

public class AquariumwaterpHvalue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input pH value of the aquarium water
        System.out.print("Enter the pH value of the aquarium water: ");
        double pHValue = scanner.nextDouble();

        // Check the pH value and display the appropriate message based on the conditions
        if (pHValue < 7) {
            System.out.println("pH value is low, partial water changes required.");
        } else if (pHValue >= 7 && pHValue <= 8) {
            System.out.println("pH value is fine.");
        } else {
            System.out.println("pH value is high, partial water change required.");
        }

        scanner.close();
    }
}


