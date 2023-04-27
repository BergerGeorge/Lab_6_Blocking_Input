import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Please enter a measurement in meters.");
            double meters = (Double.parseDouble(in.nextLine()));
            double miles = meters * 0.000621371;
            double feet = meters * 3.28084;
            double inches = meters * 39.370079;
            System.out.println("You entered " + meters + ". This value is " + miles + " mile(s), " + feet + " feet, and " + inches + " inches.");
        } catch (Exception e) {
            System.out.println("ERROR: Please enter an integer.");
        }
    }
}
