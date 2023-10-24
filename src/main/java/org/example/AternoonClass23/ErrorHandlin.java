package org.example.AternoonClass23;

import java.util.Scanner;

public class ErrorHandlin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        int age = 0;
        boolean value = false;
        while (!value) {
            try {
                System.out.println("Enter your age");
                age = Integer.parseInt(scanner.nextLine());

                if (age > 0) {
                    value = true;
                } else {
                    System.out.println("Age Must be positive integer. please try again");
                }
            }
            catch( NumberFormatException e){
                System.out.println("Age must be a positive integer, please try again");
                System.out.println("Enter your age");
                age = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter your Email Address");
                String emila = scanner.nextLine();
                System.out.println(" enter the phoneNumber");
                String phoneNumber = scanner.nextLine();

                System.out.println("Name:"+name);
                System.out.println("Age:"+age);
                System.out.println("Email:"+emila);
                System.out.println("phone Number:"+phoneNumber);
                value = true;

            }
        }scanner.close();
    }
}
