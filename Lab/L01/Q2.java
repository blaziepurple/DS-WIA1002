package lab01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
        String[] filenames = {"text1.txt", "text2.txt", "text3.txt", "text4.txt"};

        for (String file: filenames){
            processFile(file);
            System.out.println();
        }
    }

    public static void processFile(String filename){
        switch (filename) {
            case ("text1.txt") -> file1and4(filename);
            case ("text2.txt") -> file2And3(filename);
            case ("text3.txt") -> file2And3(filename);
            case ("text4.txt") -> file1and4(filename);
            default -> System.out.println("File doesn't exist lol.");
            
        }
    }

    public static void file1and4(String filename){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            StringBuilder allCharacters = new StringBuilder();
            int charactersTotal = 0;

            System.out.println("File: " + filename);
            while ((line = reader.readLine()) != null){
                String cleanedLine = line.replaceAll("[^a-zA-Z]", "");
                charactersTotal += cleanedLine.length();
                allCharacters.append(cleanedLine);
                allCharacters.append("\n");
            }
            System.out.println("Total characters: " + charactersTotal);
            System.out.println(allCharacters);
        } catch (FileNotFoundException e) {
            System.out.println("File can't be found.");
        } catch (IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void file2And3 (String filename){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            StringBuilder allCharacters = new StringBuilder();
            int charactersTotal = 0;

            System.out.println("File: " + filename);
            while ((line = reader.readLine()) != null){
                String cleanedLine = line.replaceAll("[^0-9.]", " ").trim();
                charactersTotal += cleanedLine.length();
                allCharacters.append(cleanedLine).append(" ");
            }
            System.out.println("Total characters: " + charactersTotal);
            System.out.println(allCharacters);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File can't be found.");
        } catch (IOException e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
