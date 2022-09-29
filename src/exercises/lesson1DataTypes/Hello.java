package exercises.lesson1DataTypes;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Hello, what's your name?");
        String nm = name.nextLine();
        System.out.println("Hello " + nm);
    }
}
