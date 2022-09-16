package org.launchcode.java.studio.countingchars;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) throws IOException {

//        System.out.println("Enter the string: ");
//        Scanner input = new Scanner(System.in);
//        String testString = input.nextLine();
        Path filename = FileSystems.getDefault().getPath("src","textfile.txt");
        String testString = Files.readString(filename);


        HashMap<Character, Integer> result = new HashMap<>();
        char[] charInString = testString.toLowerCase().toCharArray();

        for (char c : charInString) {
            if (c >= 'a' && c <= 'z') {
                if (result.containsKey(c)) {
                    result.put(c, result.get(c) + 1);
                } else {
                    result.put(c, 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> chars : result.entrySet()) {
            System.out.println(chars.getKey() + ": " + chars.getValue());
        }

    }
}
