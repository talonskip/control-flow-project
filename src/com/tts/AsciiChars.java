package com.tts;

public class AsciiChars {

    public static void printNumbers() {
        System.out.println("Numbers:");
        for (int i = '0'; i <= '9'; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void printLowerCase() {
        System.out.println("Lower Case:");

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }

        System.out.println();
    }

    public static void printUpperCase() {
        System.out.println("Upper Case:");

        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }

        System.out.println();
    }
}
