import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Please enter the height of the rectangle.");
            int lengthA = (Integer.parseInt(in.nextLine()));
            System.out.println("Please enter the width of your rectangle.");
            int lengthB = (Integer.parseInt(in.nextLine()));
            int area = lengthA * lengthB;
            int perimeter = lengthA + lengthA + lengthB + lengthB;
            int pythag = lengthA * lengthA + lengthB * lengthB;
            System.out.println("The area of the given values is "+area+", and the perimeter is "+perimeter+". The length of the diagonal is ");
            System.out.print(Math.sqrt(pythag));
        } catch (Exception e) {
            System.out.println("ERROR: Please enter a correct value. No decimals or letters, just integers.");
        }
    }
}

