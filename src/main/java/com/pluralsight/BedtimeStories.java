package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats the name of the story you'd like?");
        String storyName = scanner.nextLine().trim();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(storyName));
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                // %d the line number, %s the text, %n a new line
                System.out.printf("%d. %s%n", lineNumber, line);
                lineNumber++;
            }
            reader.close();
            scanner.close();
        } catch (Exception e){
            System.out.println("File not found: " + storyName);
        }

    }
}
