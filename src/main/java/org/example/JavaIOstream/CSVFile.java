package org.example.JavaIOstream;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class CSVFile {
        public static void main(String[] args) {
            String csvFileName = "student.csv";
            List<String[]> csvData = new ArrayList<>();

            try (FileInputStream fileInputStream = new FileInputStream("/Users/abirami/workspace/Exception/src/main/resources/student.csv");
                 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream))) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] values = line.split(",");
                    csvData.add(values);
                }

                // Display the CSV data as a table
                displayCSVData(csvData);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void displayCSVData(List<String[]> data) {
            for (String[] row : data) {
                for (String value : row) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }
        }
    }


