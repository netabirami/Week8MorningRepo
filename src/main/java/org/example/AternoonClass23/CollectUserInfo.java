package org.example.AternoonClass23;

import java.util.Scanner;

public class CollectUserInfo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter you name :");
        String name = scanner.nextLine();
        System.out.println("enter you age :");
        int age = scanner.nextInt();
        System.out.println("enter your phone number :");
        String phoneNumber = String.valueOf(scanner.nextLong());
        System.out.println("\nUser info");
        System.out.println("Name:" +name);
        System.out.println("Age:"+age);
        System.out.println("phone Number:"+ phoneNumber);

    }
}
