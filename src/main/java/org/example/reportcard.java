package org.example;

import java.util.Scanner;

public class reportcard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Class: ");
        String studentClass = sc.nextLine();


        System.out.println("Enter marks for subjects:");

        System.out.print("English: ");
        int eng = sc.nextInt();

        System.out.print("Mathematics: ");
        int math = sc.nextInt();

        System.out.print("Social Science: ");
        int sst = sc.nextInt();

        System.out.print("Chemistry: ");
        int chem = sc.nextInt();

        System.out.print("Physics: ");
        int phy = sc.nextInt();

        System.out.print("Biology: ");
        int bio = sc.nextInt();


        int total = eng + math + sst + chem + phy + bio;
        double percentage = total / 6.0;


        System.out.println("\n-------------------------------------");
        System.out.println("            REPORT CARD              ");
        System.out.println("-------------------------------------");
        System.out.println("NAME: " + name);
        System.out.println("CLASS: " + studentClass);
        System.out.println("-------------------------------------");
        System.out.println("SUBJECT     MARKS");
        System.out.println("-------------------------------------");

        System.out.println("English     " + eng);
        System.out.println("Mathematics " + math);
        System.out.println("Social      " + sst);
        System.out.println("Chemistry   " + chem);
        System.out.println("Physics     " + phy);
        System.out.println("Biology     " + bio);

        System.out.println("-------------------------------------");
        System.out.println("TOTAL: " + total);
        System.out.printf("PERCENTAGE: %.2f\n", percentage);
        System.out.println("-------------------------------------");

        sc.close();
    }
}