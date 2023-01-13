package com.bridgelabz.day2practiceproblems;
import java.util.Scanner;

public class MaxANdMin {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three Numbers....");
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        int b1=a+b*c;
        int b2=c+a/b;
        int b3=a%b+c;
        int b4=a*b+c;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        int max = -1, min = -1;

        if (b1 >= b2 && b1 >= b3)
            System.out.println( b1 + " is the maximum number.");
        else if (b2 >= b1 && b2 >= b3)
            System.out.println( b2 + " is the maximum number.");
        else
            System.out.println( b3 + " is the maximum number.");
    }
}
