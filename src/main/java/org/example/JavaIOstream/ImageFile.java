package org.example.JavaIOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImageFile {
    public static void main(String[] args) {
        String filename ="image.jpg";
        try (FileInputStream fileInputStream=new FileInputStream("/Users/abirami/workspace/Exception/src/main/resources/image.jpg.jpeg"))
        { int byteRead;
            while ((byteRead =fileInputStream.read())!=-1) {
                System.out.println(byteRead);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        }
    }

