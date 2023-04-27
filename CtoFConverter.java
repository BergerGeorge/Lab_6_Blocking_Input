import java.util.Scanner;
public class CtoFConverter {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide a temperature in Celsius.");
        try {
            int celsius = Integer.parseInt(in.nextLine());
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.println("Your temperature, " + celsius + " degrees C, in fahrenheit is " + fahrenheit + " degrees fahrenheit.");
        }catch (Exception e){
            System.out.println("ERROR: Please enter an integer for your temperature in celsius.");
        }
    }
}

