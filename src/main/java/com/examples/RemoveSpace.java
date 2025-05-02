package com.examples;

public class RemoveSpace {
    public static void main(String[] args) {
        String input = "Hello World! Welcome Java!";
        String result = input.replaceAll("\\s", "");

        System.out.println(result);
    }
}
