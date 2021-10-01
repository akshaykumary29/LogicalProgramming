package com.bridgelabz;


import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int no = sc.nextInt();
        int sum = 0;

        for (i = 1; i <= no / 2; i++) {
            if (no % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == no) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is not a perfect number");
        }
    }
}
