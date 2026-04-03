package org.example;
import java.util.Scanner;
public class reversenum {
    public static void main(String[] args){
        Scanner ob1 = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num= ob1.nextInt();
        int rev = 0;
        while (num > 0){
            int digit = num%10;
            rev = rev*10 + digit;
            num = num/10;

        }
        System.out.println("reverse of the entered number is:"+ rev);


}}

