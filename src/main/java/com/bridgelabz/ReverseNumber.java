package com.bridgelabz;

import java.util.Scanner;

/**
 * Reverse a number using while loop
 */
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();

        int reverse;
        reverse = reverseNum(num);
        System.out.println("Reverse number is : " + reverse);
    }

    /**
     * @param num
     * @return
     */
    public static int reverseNum(int num) {
        int rem = 0;
        int rev = 0;

        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;

    }
}
