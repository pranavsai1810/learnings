public class SellingPrice {
    public static double calculateRevisedPrice(double originalPrice, double hikePercentage) {
        double hikeAmount = originalPrice * (hikePercentage / 100);
        double revisedPrice = originalPrice + hikeAmount;
        return revisedPrice;
    }

    public static void main(String[] args) {
        // Declare and initialize variables for item name and selling price
        String itemName = "Kaisa Bowl";
        double sellingPrice = 10.99;

        // Hike percentage due to the increase in the price of raw material
        double hikePercentage = 5;

        // Calculate the revised selling price
        double revisedPrice = calculateRevisedPrice(sellingPrice, hikePercentage);

        // Display the revised selling price
        System.out.println("The revised selling price of the item " + itemName + " is: $" + revisedPrice);
    }
}
