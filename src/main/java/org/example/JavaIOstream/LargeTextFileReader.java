package org.example.JavaIOstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LargeTextFileReader {
    public static void main(String[] args) {

        String filePath ="/Users/abirami/workspace/Exception/src/main/resources/LargeFiledata.txt";
        int bufferSize = 1024;
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader))
        {char[] buffer = new char[bufferSize];
            int charsRead;
        while ((charsRead = bufferedReader.read(buffer,0,bufferSize))!=-1){
            String chunk = new String(buffer,0,charsRead);
            System.out.println(chunk);
        }

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
