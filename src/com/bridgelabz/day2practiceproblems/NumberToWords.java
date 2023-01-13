package com.bridgelabz.day2practiceproblems;
import java.util.Scanner;
public class NumberToWords {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scan.nextInt();
        if(number == 1)
        {
            System.out.println("one");
        }else if(number == 2) {
            System.out.println("Two");
        }else if(number == 3) {
            System.out.println("Three");
        }else if(number == 4) {
            System.out.println("four");
        }else if(number == 5) {
            System.out.println("Five");
        }else {
            System.out.println("end else");
        }
    }
}
