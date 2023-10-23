package org.example.Week8day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileCopy {
    public static  void main(String[] args) {
        String sourceFileName = "source.text";
        String destinationFileName = "destination.txt";

        try(FileInputStream sourceFile = new FileInputStream(sourceFileName);
            FileOutputStream destinationFile = new FileOutputStream(destinationFileName))
        {
            byte[]bufffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = sourceFile.read(bufffer))!= -1){
                destinationFile.write(bufffer,0,bytesRead);
            }
            System.out.println("file copied successfully!" + Arrays.toString(destinationFileName.getBytes()));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
