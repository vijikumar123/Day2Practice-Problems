package com.bridgelabz.day2practiceproblems;
import java.util.Scanner;
public class ForLoopNaturalNum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Number");
        int N=scan.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " +");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum of first " + N
                + " Natural Number = " + sum);
    }

}
