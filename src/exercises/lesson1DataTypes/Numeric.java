package exercises.lesson1DataTypes;

import java.util.Scanner;

public class Numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Miles: ");
        Double numMiles = input.nextDouble();

        System.out.print("Gas: ");
        Double numGal = input.nextDouble();

        Double mpg = numMiles / numGal;
        System.out.println("MPG: " + mpg);
    }
}
