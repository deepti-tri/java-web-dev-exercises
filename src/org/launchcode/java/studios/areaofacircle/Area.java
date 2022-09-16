package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        System.out.print("Enter the radius: ");
        Scanner input = new Scanner(System.in);
        try {
            double radius = input.nextDouble();
            while (radius < 0) {
                System.out.print("Invalid input! Enter the radius: ");
                radius = input.nextDouble();
            }
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }
        catch (Exception e) {
            System.out.print("Invalid input!");

        }



    }
}
