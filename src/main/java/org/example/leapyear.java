package org.example;

import java.util.Scanner;

    public class leapyear {
        public static void main(String[] args) {
            Scanner ob1 = new Scanner(System.in);

            System.out.print("Enter the year: ");
            int year = ob1.nextInt();
            if (year% 4 == 0){
                System.out.println("Leap Year");

            }
            else{
                System.out.println("Not Leap Year");
            }
}}
