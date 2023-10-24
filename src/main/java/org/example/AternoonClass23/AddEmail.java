package org.example.AternoonClass23;

import java.io.*;
import java.util.Scanner;

public class AddEmail {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            FileInputStream fileInputStream =new FileInputStream("/Users/abirami/workspace/Exception/src/main/resources/info.txt");
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
            String phoneNumber = bufferedReader.readLine();
            String address = bufferedReader.readLine();

            System.out.println("current Phone number" +phoneNumber);
            System.out.println("current Address"+address);

            System.out.println("please enter your phone Number");
            String newPhoneNumber =scanner.nextLine();
            System.out.println("Enter your address");
            String newAddress = scanner.nextLine();

            FileWriter fileWriter = new FileWriter("/Users/abirami/workspace/Exception/src/main/resources/info.txt");
            fileWriter.write(newPhoneNumber+"\n"+newAddress);
            fileWriter.close();

            System.out.println("User information updated successfully.");

            System.out.println("Updated Phone Number: " + newPhoneNumber);
            System.out.println("Updated Address: " + newAddress);




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
