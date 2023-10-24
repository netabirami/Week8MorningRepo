package org.example;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionDemo ed = new ExceptionDemo();
        ed.divide();
        ed . add();
    }

    private void add() {
                Scanner scaner = new Scanner(System.in);
        int no1 = scaner.nextInt();
        int no2 = scaner.nextInt();
        int result = no1+no2;
        System.out.println("Addition = "+result);
    }

    private void divide() {
               Scanner scaner = new Scanner(System.in);
        System.out.println("enter the number");
       int no1 = scaner.nextInt();
        int no2 = scaner.nextInt();
        try {
            int result = no1 / no2;
            System.out.println("Division = "+result);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("The given number is 0 please provide a valued number");
            divide();
        }


    }
}