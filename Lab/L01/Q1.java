package lab01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        String filename = "Aimaan_22119318.txt";

        try {
            BufferedReader reader = new BufferedReader (new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e){
            System.out.println("The file can't be found.");
        } catch (IOException e){
            System.out.println("Error reading from file.");
        }

        try {
            System.out.println("\nAdd a new entry to the file. (Type 'quit' to exit.)");
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            Scanner keyboard = new Scanner(System.in);

            String addedText = "";
            
            writer.newLine();
            writer.write("\n");
            while (true){
                addedText = keyboard.nextLine();

                if (addedText.equals("quit")){
                    break;
                }

                writer.write("\n");
                writer.write(addedText);
            }

            
            writer.close();
            keyboard.close();

        } catch (FileNotFoundException e){
            System.out.println("The file can't be found.");
        } catch (IOException e){
            System.out.println("Error reading from file.");
        }
    }
}