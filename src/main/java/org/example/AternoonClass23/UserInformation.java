package org.example.AternoonClass23;

import java.io.*;

public class UserInformation {
    public static void main(String[] args) {
        String userFileName = "info.txt";
        try {
            FileReader fileReader = new FileReader("/Users/abirami/workspace/Exception/src/main/resources/info.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}