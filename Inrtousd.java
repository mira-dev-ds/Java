//Input currency in rupees and output in USD.
import java.util.Scanner;

public class Inrtousd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a currency value in rupees(INR): ");
        int currencyInRupees = input.nextInt();
        int exchangeRate = 83;
        double dollars = currencyInRupees / exchangeRate;
        System.out.println("Equivalent currency value in USD is : " + dollars);
    }
}