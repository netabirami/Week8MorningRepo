package org.example.Week8day1;

import java.io.*;
import java.util.Scanner;

public class ConsoleInput {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);


//        // Read and display text input
//        System.out.println("Please enter some text:");
//        String inputText = scanner.nextLine();
//        System.out.println("Your Text: " + inputText);
//
//        // Read and display name input
//        System.out.println("Enter your name:");
//        String inputName = scanner.nextLine();
//        System.out.println("Your Name: " + inputName);

        // File reading and writing code
        String sourceFileName = "/Users/abirami/workspace/Exception/src/main/resources/input.txt"; // Change to the actual source file
        String destinationFileName = "/Users/abirami/workspace/Exception/src/main/resources/output.txt"; // Change to the desired destination file

        try (FileInputStream sourceFile = new FileInputStream(sourceFileName);
             FileOutputStream destinationFile = new FileOutputStream(destinationFileName)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = sourceFile.read(buffer)) != -1) {
                destinationFile.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}

