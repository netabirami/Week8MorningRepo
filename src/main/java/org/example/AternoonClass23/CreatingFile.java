package org.example.AternoonClass23;

import java.io.File;

public class CreatingFile {
    public static void main(String[] args) {
        File file = new File("//Users//abirami//workspace//Exception//src//main//resources//abi");
       boolean present = file.exists();
        System.out.println("folder  present : "+present);
        if (present==false)
            file.mkdir();

        present=file.exists();
        System.out.println(present);
    }
}
