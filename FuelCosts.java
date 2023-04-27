import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Please enter the number of gallons in your gas tank.");
            int gallons = (Integer.parseInt(in.nextLine()));
            System.out.println("Next enter how many miles you get to a gallon.");
            int efficiency = (Integer.parseInt(in.nextLine()));
            System.out.println("Finally, enter the price of gas per gallon. Include decimals.");
            double price = Double.parseDouble(in.nextLine());

            int range = gallons * efficiency;
            double hundredMiles = 100 / efficiency;
            double hundredPrice = hundredMiles * price;
            System.out.println("Your car can go " + range + " miles on a full tank, and it would cost $" + hundredPrice + " to go 100 miles.");

        } catch (Exception e) {
            System.out.println("ERROR: Please enter a correct value for each prompt. Only numbers, decimals when asked for it.");
        }
    }
}

