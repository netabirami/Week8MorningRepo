package org.example.JavaIOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fileInputStream= new FileInputStream("/Users/abirami/workspace/Exception/src/main/resources/inputFile.txt");
            int data;
            while ((data = fileInputStream.read())!=-1){
                System.out.println((char)data);
            }
        }
         catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
