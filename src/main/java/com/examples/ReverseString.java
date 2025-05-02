package com.examples;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Words: ");
        String n = scanner.nextLine();

        String reverse = reverseWords(n);
        System.out.println("Reverse Words : " + reverse);

    }

    private static String reverseWords(String n) {
        return new StringBuilder(n).reverse().toString();
    }
}
