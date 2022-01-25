package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?: ");
        Double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas have you used?: ");
        Double gallonsUsed = input.nextDouble();
        input.close();

        Double milesPerGallon = milesDriven / gallonsUsed;
        System.out.println("Your mpg is: " + milesPerGallon);
    }
}
