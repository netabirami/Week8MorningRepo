package org.example.AternoonClass23;

import java.util.Scanner;

public class UserInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name= scanner.nextLine();
        System.out.println("Name"+name);

        System.out.println("Enter The Age");
        int age = scanner.nextInt();
        System.out.println("Age:" + age);

        System.out.println("Enter your Email: ");
        String email = scanner.nextLine();
        System.out.println(" Email:"+email);

        System.out.println("Enter the phone number");
        String phoneNumber = scanner.nextLine();

        displayInformation(name, age,email,phoneNumber);

    }


        public static void displayInformation(String name, int age, String email, String
        phoneNumber){
// Displaying the collected information
            System.out.println("\nUser Information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);


    }

}
