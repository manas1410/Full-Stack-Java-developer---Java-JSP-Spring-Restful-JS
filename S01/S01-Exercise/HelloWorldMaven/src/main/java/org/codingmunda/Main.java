package org.codingmunda;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // (a+b)^2 = a^2 + 2ab + b^2
        int a = 25;
        float b = 45.2323f;
        double value = a*a + 2*(a*b) + b*b;
        System.out.println(value);
        System.out.println((float) value);
        System.out.println((int) value);
        System.out.printf("Hello and welcome!");

    }
}