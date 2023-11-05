                     // TASK 4 CurrencyConverter

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Replace with the actual API URL that provides exchange rates
        String apiUrl = "REPLACE_WITH_YOUR_API_URL_HERE";

        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine();
        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine();

        // Fetch exchange rates from the API (you need to implement this)
        double exchangeRate = fetchExchangeRate(apiUrl, baseCurrency, targetCurrency);

        if (exchangeRate != -1) {
            System.out.print("Enter the amount in " + baseCurrency + ": ");
            double amountToConvert = scanner.nextDouble();

            double convertedAmount = amountToConvert * exchangeRate;

            System.out.println(amountToConvert + " " + baseCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
        } else {
            System.out.println("Unable to fetch exchange rates. Please try again later.");
        }

        scanner.close();
    }

    // Replace this with code to fetch exchange rates from a real API
    private static double fetchExchangeRate(String apiUrl, String baseCurrency, String targetCurrency) {
        // Implement code to make an API request and parse the response to get exchange rates.
        // Return the actual exchange rate.
        return 0.85; // Replace with the actual exchange rate.
    }
}